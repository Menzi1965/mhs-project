package com.mhs.spring.project.mhs_project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studentId")
    private int studentId;

    @JoinColumn(name="grade_gradeid",referencedColumnName = "gradeId")
    @ManyToOne(optional = false,cascade = CascadeType.PERSIST)
    private Grade grade;

    @JoinColumn(name="person_personid",referencedColumnName = "personId")
    @OneToOne(optional = false,cascade = CascadeType.PERSIST)
    private Person person;
}
