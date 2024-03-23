package com.user.registrarion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {

    //This method handles a 'get' request to the homepage
    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("home.html");
        return mv;
    }

}
