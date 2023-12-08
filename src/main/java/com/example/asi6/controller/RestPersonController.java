package com.example.asi6.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asi6.repository.PersonRepository;
import com.example.asi6.service.PersonServiceImp;

import jakarta.websocket.server.PathParam;

import com.example.asi6.model.Person;

@RestController
@RequestMapping("/api/person")
public class RestPersonController {
    
    @Autowired
    PersonServiceImp personService;

    @GetMapping
    public ResponseEntity< List<Person> > getAllPerson(){
        return ResponseEntity.ok().body(personService.getallPerson());
    }

    @GetMapping("/{id}")
    public ResponseEntity< Person > getPerson(@PathParam("id") long id){
        return ResponseEntity.ok().body(personService.getPerson(id));
    }
}
