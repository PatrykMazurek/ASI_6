package com.example.asi6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.asi6.model.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer>{
    
}
