package com.example.backend.controller;

import com.example.backend.entity.Product;
import com.example.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/find-all")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping("/register")
    public Product insert(@RequestBody Product product){
        return productService.insert(product);
    }

    @PutMapping("/update")
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        productService.delete(id);
        return ResponseEntity.ok().build();
    }

}
