package com.duing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {

    @GetMapping("/customInterceptor")
    public String customServlet(){
        return "Success";
    }
}
