package com.example.asi6.model;

public class Commission {
    
    private String appointmentDate;
    private String code;
    private String compositionDate;
    private Member[] members;
    private String name;
    private String phone;
    private String scope;
    private String nameGenitive;
    private String type;

    public Commission(String appointmentDate, String code, String compositionDate, Member[] members, String name,
            String phone, String scope, String nameGenitive, String type) {
        this.appointmentDate = appointmentDate;
        this.code = code;
        this.compositionDate = compositionDate;
        this.members = members;
        this.name = name;
        this.phone = phone;
        this.scope = scope;
        this.nameGenitive = nameGenitive;
        this.type = type;
    }

    public Commission(){}

    public String getAppointmentDate() {
        return appointmentDate;
    }
    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getCompositionDate() {
        return compositionDate;
    }
    public void setCompositionDate(String compositionDate) {
        this.compositionDate = compositionDate;
    }
    public Member[] getMembers() {
        return members;
    }
    public void setMembers(Member[] members) {
        this.members = members;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getNameGenitive() {
        return nameGenitive;
    }

    public void setNameGenitive(String nameGenitive) {
        this.nameGenitive = nameGenitive;
    }

}
