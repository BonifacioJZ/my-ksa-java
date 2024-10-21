package com.bonifacio.my_ksa.controller;

import com.bonifacio.my_ksa.services.category.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"product/category/",""})
@AllArgsConstructor
public class CategoryController {
    @Autowired
    private final ICategoryService categoryService;

    @RequestMapping(value = "/")
    public String Index(Model model){
        model.addAttribute("title","Categorias");
        return "category/index";
    }
}
