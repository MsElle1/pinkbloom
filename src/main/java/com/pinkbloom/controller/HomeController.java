package com.pinkbloom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/signup")
    public String signupPage(){
        return "signup";
    }
    @GetMapping("home.html")
    public String home(){
        return "home";
    }

    @GetMapping("shop.html")
    public String shop(){
        return "shop";
    }

    @GetMapping("about.html")
    public String about(){
        return "about";
    }

}