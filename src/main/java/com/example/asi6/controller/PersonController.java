package com.example.asi6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.asi6.service.PersonServiceImp;

@Controller
@RequestMapping("/person")
public class PersonController {
    
    @Autowired
    PersonServiceImp personService;

    @GetMapping("/list")
    public String showAllPerson(Model model){
        model.addAttribute("persons", personService.getallPerson());
        return "list_person";
    }


}
