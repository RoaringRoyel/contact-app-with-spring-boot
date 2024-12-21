package com.contact.contact_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(){ //same nameing is important IG
        System.out.println("HOME");
        return "home";
    }
}
