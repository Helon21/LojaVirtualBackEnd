package com.example.backend.controller;

import com.example.backend.entity.Permission;
import com.example.backend.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping("/find-all")
    public List<Permission> findAll(){
        return permissionService.findAll();
    }

    @PostMapping("/register")
    public Permission insert(@RequestBody Permission permission){
        return permissionService.insert(permission);
    }

    @PutMapping("/update")
    public Permission update(@RequestBody Permission permission){
        return permissionService.insert(permission);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        permissionService.delete(id);
        return ResponseEntity.ok().build();
    }


}
