package com.bonifacio.my_ksa.controller;

import com.bonifacio.my_ksa.services.category.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"product/category/",""})
@AllArgsConstructor
public class CategoryController {
    @Autowired
    private final ICategoryService categoryService;

    @RequestMapping(value = {"/",""})
    public String Index(
            Model model,
            @PageableDefault(page = 0,size = 10) Pageable pageable){
        var categories = categoryService.getAll(pageable);
        model.addAttribute("title","Categorias");
        model.addAttribute("categories",categories);
        return "category/index";
    }
}
