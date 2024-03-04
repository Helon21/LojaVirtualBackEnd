package com.example.backend.controller;

import com.example.backend.entity.Person;
import com.example.backend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/find-all")
    public List<Person> findAll(){
        return personService.findAll();
    }

    @RequestMapping("/register")
    public Person insert(@RequestBody Person person){
        return personService.insert(person);
    }

    @RequestMapping("/update")
    public Person update(@RequestBody Person person){
        return personService.update(person);
    }

    @RequestMapping("/delete/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        personService.delete(id);
        return ResponseEntity.ok().build();
    }

}
