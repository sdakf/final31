package com.sda.final31.finalapp.users;

import com.sda.final31.finalapp.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String displayForm(Model model) {
        model.addAttribute("countries", Countries.values());
        model.addAttribute("emptyObject", new UserRegistrationDto());
        return "registerPage";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserRegistrationDto dto, Model model) {
        UserListDto userListDto = userService.saveUser(dto);
        model.addAttribute("fn", "Imię: " + userListDto.getFirstName());
        model.addAttribute("sn", "Nazwisko: " + userListDto.getSurname());
        model.addAttribute("city", "Miasto: " + userListDto);
        return "welcomePage"; //nazwa pliku html
    }
}
