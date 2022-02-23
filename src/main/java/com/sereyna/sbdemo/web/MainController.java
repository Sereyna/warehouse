package com.sereyna.sbdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/login")
    public String login(Model m){
        return "login";
    }

    @RequestMapping("/home")
    public String start(Model m){
        return "home";
    }

    @RequestMapping("/java")
    public String java(Model m){
        return "java";
    }

    @RequestMapping("/linux")
    public String linux(Model m){
        return "linux";
    }

}
