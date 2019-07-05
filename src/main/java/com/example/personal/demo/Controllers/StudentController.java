package com.example.personal.demo.Controllers;

import com.example.personal.demo.Models.Student;
import com.example.personal.demo.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService repo;

    @RequestMapping(value = "/formStudent", method = RequestMethod.GET)
    public String formStudnet(){
        return "th_addStudent";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") Student student){
        repo.save(student);
        return "th_index";
    }

    @RequestMapping(value = "/studentList",method = RequestMethod.GET)
    public String getStudents(Model model){
        model.addAttribute("myStudentList", repo.findAll());
        return "th_studentList";
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public String getStudent(@RequestParam Long idIndex,Model model){

        model.addAttribute("student", repo.findById(idIndex));
        return "th_specificStudent";
    }
}
