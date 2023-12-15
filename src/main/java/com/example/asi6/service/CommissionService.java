package com.example.asi6.service;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.asi6.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CommissionService {
    
    private Commission[] getData(){
        String url = "https://api.sejm.gov.pl/sejm/term10/committees";
        RestTemplate rest = new RestTemplate();
        String result = rest.getForObject(url, String.class);
        ObjectMapper mapper = new ObjectMapper();
        Commission[] commision = null;
        try {
            commision = mapper.readValue(result, Commission[].class);
            System.out.println(commision[0].getAppointmentDate());
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return commision;
    }


    public List<Commission> getAllCommissions(){
        return Arrays.asList(getData()) ;
    }
}
