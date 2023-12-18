package com.example.asi6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.asi6.model.Region;
import com.example.asi6.repository.RegionRepository;

@Service
public class RegionServiceImp implements RegionService {

    @Autowired
    RegionRepository regionRepository;

    @Override
    public Region getRegion(int id) {
        return regionRepository.findById(id).orElse(null);
    }
    
}
