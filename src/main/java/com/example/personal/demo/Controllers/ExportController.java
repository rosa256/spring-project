package com.example.personal.demo.Controllers;

import com.example.personal.demo.Models.Student;
import com.example.personal.demo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExportController {

    @Autowired
    StudentRepository studentRepository;


    //* Handle request to download an Pdf document

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public String download(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "";
    }
}
