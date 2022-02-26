package com.sda.final31;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @PostMapping("/register")
    public String register(@ModelAttribute UserRegistrationDto userRegistrationDto) {


        return ""; //nazwa pliku html
    }
}
