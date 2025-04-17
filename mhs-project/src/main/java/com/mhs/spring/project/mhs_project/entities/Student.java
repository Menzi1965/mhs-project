package com.mhs.spring.project.mhs_project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studentId")
    private int studentId;

    @JoinColumn(name="grade_gradeid",referencedColumnName = "gradeId")
    @ManyToOne(optional = false,cascade = CascadeType.PERSIST)
    private Grade grade;

    @JoinColumn(name="person_personid",referencedColumnName = "PERSON_ID")
    @OneToOne(optional = false,cascade = CascadeType.PERSIST)
    private Person person;


    public Student(int studentId, Grade grade, Person person) {
        this.studentId = studentId;
        this.grade = grade;
        this.person = person;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
