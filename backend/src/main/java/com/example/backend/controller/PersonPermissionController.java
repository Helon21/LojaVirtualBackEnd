package com.example.backend.controller;

import com.example.backend.entity.PersonPermission;
import com.example.backend.service.PersonPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person-permission")
public class PersonPermissionController {

    @Autowired
    private PersonPermissionService personPermissionService;

    @GetMapping("/find-all")
    public List<PersonPermission> findAll(){
        return personPermissionService.findAll();
    }

    @PostMapping("/register")
    public PersonPermission insert(@RequestBody PersonPermission personPermission){
        return personPermissionService.insert(personPermission);
    }

    @PutMapping("/update")
    public PersonPermission update(@RequestBody PersonPermission personPermission){
        return personPermissionService.update(personPermission);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        personPermissionService.delete(id);
        return ResponseEntity.ok().build();
    }

}
