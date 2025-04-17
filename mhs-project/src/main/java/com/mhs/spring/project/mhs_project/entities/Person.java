package com.mhs.spring.project.mhs_project.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Table(name="person")
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PERSON_ID")
    private int personId;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="IDNO")
    private int idNo;

    @Column(name="gender")
    private String gender;


    public Person( String name, String surname, int idNo, String gender) {

        this.name = name;
        this.surname = surname;
        this.idNo = idNo;
        this.gender = gender;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

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
        this.idNo = idNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
