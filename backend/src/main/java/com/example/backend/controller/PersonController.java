package com.example.backend.controller;

import com.example.backend.entity.Person;
import com.example.backend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/find-all")
    public List<Person> findAll(){
        return personService.findAll();
    }

    @PostMapping("/register")
    public Person insert(@RequestBody Person person){
        return personService.insert(person);
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person person){
        return personService.update(person);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        personService.delete(id);
        return ResponseEntity.ok().build();
    }

}
