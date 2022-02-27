package com.sda.final31;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/register")
    public String displayForm(Model model) {
        model.addAttribute("aaaatxt", "Napis " + System.currentTimeMillis());
        return "registerPage";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserRegistrationDto userRegistrationDto) {


        return "registerPage"; //nazwa pliku html
    }
}
