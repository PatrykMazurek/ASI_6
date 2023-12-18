package com.example.asi6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "region")
public class Region {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String gmina;
    private String powiat;
    private String wojewodztwo;

    public Region() {}

    public Region(int id, String gmina, String powiat, String wojewodztwo) {
        this.id = id;
        this.gmina = gmina;
        this.powiat = powiat;
        this.wojewodztwo = wojewodztwo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGmina() {
        return gmina;
    }
    public void setGmina(String gmina) {
        this.gmina = gmina;
    }
    public String getPowiat() {
        return powiat;
    }
    public void setPowiat(String powiat) {
        this.powiat = powiat;
    }
    public String getWojewodztwo() {
        return wojewodztwo;
    }
    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }
    

}
