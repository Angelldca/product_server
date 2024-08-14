package com.angelldca.product_service.service;

import com.angelldca.product_service.persistence.Entity.Category;
import com.angelldca.product_service.persistence.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }
}
