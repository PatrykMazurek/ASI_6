package com.example.asi6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.asi6.service.CommissionService;


@Controller
@RequestMapping("/comision")
public class ComisionController {
    
    @Autowired
    CommissionService commissionService;

    @GetMapping("/")
    public String showCommistion(Model model){
        model.addAttribute("commissions", commissionService.getAllCommissions());
        return "list_commission";
    }

}
