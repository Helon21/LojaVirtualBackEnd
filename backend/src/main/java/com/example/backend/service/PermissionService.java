package com.example.backend.service;

import com.example.backend.entity.Permission;
import com.example.backend.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    public List<Permission> findAll(){
        return permissionRepository.findAll();
    }

    public Permission insert(Permission permission){
        permission.setCreatedAt(new Date());
        Permission newPermission = new Permission();
        return permissionRepository.saveAndFlush(permission);
    }

    public Permission update(Permission permission){
        permission.setUpdatedAt(new Date());
        Permission newPermission = new Permission();
        return permissionRepository.saveAndFlush(permission);
    }

    public void delete(Long id){
        Permission permission = permissionRepository.findById(id).get();
        permissionRepository.delete(permission);
    }


}
