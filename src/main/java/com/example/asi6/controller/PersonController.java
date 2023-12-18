package com.example.asi6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.asi6.model.Person;
import com.example.asi6.service.PersonServiceImp;
import com.example.asi6.service.RegionServiceImp;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/person")
public class PersonController implements WebMvcConfigurer {
    
    @Autowired
    PersonServiceImp personService;

    @Autowired
    RegionServiceImp regionService;

    @GetMapping("/list")
    public String showAllPerson(Model model){
        model.addAttribute("persons", personService.getallPerson());
        return "list_person";
    }

    @GetMapping("/new")
    public String showNewPersonForm(Model model){
        Person p = new Person();
        model.addAttribute("person", p);
        return "new_person";
    }

    @PostMapping("/add")
    public String addNewPerson(@Valid @ModelAttribute("person") Person p, 
        BindingResult bindingResult){

            if (bindingResult.hasErrors()){
                return "new_person";
            }
            p.setRegion(regionService.getRegion(1));
            personService.addPerson(p);

            return "redirect:/person/list";
        }
}
