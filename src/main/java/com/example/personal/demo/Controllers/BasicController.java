package com.example.personal.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {

    @RequestMapping(value = { "/", "index" }, method = RequestMethod.GET)
    public String index(Model model) {

        String message = "Hello Student Task";

        model.addAttribute("message", message);

        return "th_index";
    }

    @RequestMapping(value = { "/testJsp" }, method = RequestMethod.GET)
    public String testJspView() {

        return "testJsp";
    }

    @RequestMapping(value = { "/testThymeleaf" }, method = RequestMethod.GET)
    public String testThymeleafView() {

        return "th_index";
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String getHello(){
        return "Hello WhiteStock!";
    }

}
