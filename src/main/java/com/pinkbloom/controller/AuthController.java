package com.pinkbloom.controller;

import com.pinkbloom.model.User;
import com.pinkbloom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public String registerUser(@ModelAttribute User user){
        userRepository.save(user);
        return "redirect:/";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password){

        User user = userRepository.findByEmail(email);

        if(user != null && user.getPassword().equals(password)){
            return "home";
        }

        return "redirect:/";
    }

}