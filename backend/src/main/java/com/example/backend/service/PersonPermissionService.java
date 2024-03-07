package com.example.backend.service;

import com.example.backend.entity.PersonPermission;
import com.example.backend.repository.PersonPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PersonPermissionService {

    @Autowired
    private PersonPermissionRepository personPermissionRepository;

    public List<PersonPermission> findAll(){
        return personPermissionRepository.findAll();
    }

    public PersonPermission insert(PersonPermission personPermission){
        personPermission.setCreatedAt(new Date());
        PersonPermission newPersonPermission = new PersonPermission();
        return personPermissionRepository.saveAndFlush(personPermission);
    }

    public PersonPermission update(PersonPermission personPermission){
        personPermission.setUpdateAt(new Date());
        return personPermissionRepository.saveAndFlush(personPermission);
    }

    public void delete(Long id){
        PersonPermission personPermission = personPermissionRepository.findById(id).get();
        personPermissionRepository.delete(personPermission);
    }

}
