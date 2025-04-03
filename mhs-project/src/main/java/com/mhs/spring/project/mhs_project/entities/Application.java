package com.mhs.spring.project.mhs_project.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table(name="application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="applicationId")
    private int applicationId;

    @Column(name="reason")
    private String reason;

    @Column(name="gradeAppliedFor")
    private int gradeAppliedFor;

    @Column(name="status")
    private String status;

    @JoinColumn(name="student_studentid",referencedColumnName = "studentId")
    @OneToOne(optional = false,cascade = CascadeType.PERSIST)
    private Student student;

}
