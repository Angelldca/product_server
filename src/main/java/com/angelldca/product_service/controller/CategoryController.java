package com.angelldca.product_service.controller;


import com.angelldca.product_service.persistence.Entity.Category;
import com.angelldca.product_service.persistence.Repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {


    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    @GetMapping
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    @PostMapping
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }
}
