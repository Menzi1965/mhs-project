package com.mhs.spring.project.mhs_project.entities;


import jakarta.persistence.*;

@Entity

@Table(name="application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="applicationId")
    private int applicationId;

    @Column(name="reason")
    private String reason;

    @Column(nullable = true,name="gradeAppliedFor")
    private int gradeAppliedFor;

    @Column(name="status")
    private String status;

    @JoinColumn(name="student_studentid",referencedColumnName = "studentId")
    @OneToOne(optional = false,cascade = CascadeType.PERSIST)
    private Student student;

    public Application( int gradeAppliedFor , String status,String reason,  Student student) {
        this.reason = reason;
        this.gradeAppliedFor = gradeAppliedFor;
        this.status = status;
        this.student = student;
    }


}
