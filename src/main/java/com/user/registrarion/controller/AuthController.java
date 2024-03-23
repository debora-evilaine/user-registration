package com.user.registrarion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    //This method handles a 'get' request to the homepage
    @GetMapping("/home")
    public String home(){
        return "home";
    }

}
