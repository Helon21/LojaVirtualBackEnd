package com.example.backend.controller;

import com.example.backend.entity.Brand;
import com.example.backend.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/find-all")
    public List<Brand> findAll(){
        return brandService.findAll();
    }

    @PostMapping("/register")
    public Brand insert(Brand brand){
        return brandService.insert(brand);
    }

    @PutMapping("/update")
    public Brand update(Brand brand){
        return brandService.update(brand);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        brandService.delete(id);
        return ResponseEntity.ok().build();
    }
}
