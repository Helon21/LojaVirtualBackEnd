package com.example.backend.controller;

import com.example.backend.entity.Category;
import com.example.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    public List<Category> findAll(){
        return categoryService.findAll();
    }

    public Category insert(@RequestBody Category category){
        return categoryService.insert(category);
    }

    public Category update(@RequestBody Category category){
        return categoryService.update(category);
    }

    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        categoryService.delete(id);
        return ResponseEntity.ok().build();
    }

}
