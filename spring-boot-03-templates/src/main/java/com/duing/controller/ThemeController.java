package com.duing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThemeController {

    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("name", "<span style='color:red'>thymeleaf</span>");
        return "thymeleaf/hello";
    }
}
