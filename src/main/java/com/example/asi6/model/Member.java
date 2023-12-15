package com.example.asi6.model;

public class Member {
    
    private String club;
    private String function;
    private int id;
    private String lastFirstName;

    public Member() {}
    
    public Member(String club, String function, int id, String lastFirstName) {
        this.club = club;
        this.function = function;
        this.id = id;
        this.lastFirstName = lastFirstName;
    }
    public String getClub() {
        return club;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public String getFunction() {
        return function;
    }
    public void setFunction(String function) {
        this.function = function;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLastFirstName() {
        return lastFirstName;
    }
    public void setLastFirstName(String lastFirstName) {
        this.lastFirstName = lastFirstName;
    }
    

}
