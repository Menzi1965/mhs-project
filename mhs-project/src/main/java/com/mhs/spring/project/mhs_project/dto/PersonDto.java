package com.mhs.spring.project.mhs_project.dto;

public class PersonDto {
    private String name;

    private String surname;
    private final int idNo;

    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        idNo = idNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }





    public PersonDto(String name, String surname, int idNo, String gender) {
        this.name = name;
        this.surname = surname;
        this.idNo = idNo;
        this.gender = gender;

    }
}
