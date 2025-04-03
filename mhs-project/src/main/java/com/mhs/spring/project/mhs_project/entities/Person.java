package com.mhs.spring.project.mhs_project.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name="person")
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@Builder

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="idNo")
    private int idNo;

    @Column(name="gender")
    private String gender;





}
