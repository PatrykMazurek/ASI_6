package com.example.asi6.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asi6.repository.PersonRepository;

import jakarta.websocket.server.PathParam;

import com.example.asi6.model.Person;

@RestController
@RequestMapping("/api/person")
public class RestPersonController {
    
    @Autowired
    PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathParam("id") long id){
        return personRepository.findById(id).orElseThrow();
    }
}
