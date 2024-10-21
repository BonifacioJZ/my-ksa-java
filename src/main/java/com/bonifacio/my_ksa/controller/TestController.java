package com.bonifacio.my_ksa.controller;

import com.bonifacio.my_ksa.services.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test/")
public class TestController {

    private final ICategoryService categoryService;
    @Autowired
    public TestController(ICategoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping(value = "")
    public ResponseEntity<?> index(@PageableDefault(page = 0,size = 10)Pageable pageable){
        var result = this.categoryService.getAll(pageable);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
