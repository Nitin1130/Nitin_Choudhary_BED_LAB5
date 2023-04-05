package com.ems.Nitin_Choudhary_BED_LAB5.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeController{


    @GetMapping("/welcome")
    public String handleWelcomePage() {
        return "welcome";
    }
}
