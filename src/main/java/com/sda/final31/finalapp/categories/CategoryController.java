package com.sda.final31.finalapp.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public String showCategories(@RequestParam(required = false) String searchText, Model model) {
        model.addAttribute("categoriesData", categoryService.findCategories(searchText));
        return "categoriesPage";
    }


}
