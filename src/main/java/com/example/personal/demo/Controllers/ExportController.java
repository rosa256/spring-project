package com.example.personal.demo.Controllers;

import com.example.personal.demo.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class ExportController {

    private StudentService studentService;


    //* Handle request to download an Pdf document

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public String download(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "";
    }
}
