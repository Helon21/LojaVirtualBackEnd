package com.example.backend.controller;

import com.example.backend.entity.City;
import com.example.backend.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/find-all")
    public List<City> findAll(){
        return cityService.findAll();
    }

    @PostMapping("/register")
    public City insert(City city){
        return cityService.insert(city);
    }

    @PutMapping("/update")
    public City update(City city){
        return cityService.update(city);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        cityService.delete(id);
        return ResponseEntity.ok().build();
    }

}
