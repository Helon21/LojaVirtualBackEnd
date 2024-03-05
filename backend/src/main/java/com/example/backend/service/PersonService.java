package com.example.backend.service;

import com.example.backend.entity.Person;
import com.example.backend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Person insert(Person person){
        person.setCreationDate(new Date());
        Person newPerson = new Person();
        return personRepository.saveAndFlush(person);
    }

    public Person update(Person person){
        person.setUpdateDate(new Date());
        return personRepository.saveAndFlush(person);
    }

    public void delete(Long id){
        Person person = personRepository.findById(id).get();
        personRepository.delete(person);
    }

}
