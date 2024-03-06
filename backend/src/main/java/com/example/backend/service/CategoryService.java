package com.example.backend.service;

import com.example.backend.entity.Category;
import com.example.backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category insert(Category category){
        category.setCreatedAt(new Date());
        Category newCategory = new Category();
        return categoryRepository.saveAndFlush(category);
    }

    public Category update(Category category){
        category.setUpdatedAt(new Date());
        return categoryRepository.saveAndFlush(category);
    }

    public void delete(Long id){
        Category category = categoryRepository.findById(id).get();
        categoryRepository.delete(category);
    }

}
