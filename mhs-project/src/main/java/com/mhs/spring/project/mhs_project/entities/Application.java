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

    @Column(name="gradeAppliedFor")
    private int gradeAppliedFor;

    @Column(name="status")
    private String status;

    @JoinColumn(name="student_studentid",referencedColumnName = "studentId")
    @OneToOne(optional = false,cascade = CascadeType.PERSIST)
    private Student student;


    public Application(int applicationId, String reason, String status, Student student) {
        this.applicationId = applicationId;
        this.reason = reason;
        this.gradeAppliedFor = gradeAppliedFor;
        this.status = status;
        this.student = student;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getGradeAppliedFor() {
        return gradeAppliedFor;
    }

    public void setGradeAppliedFor(int gradeAppliedFor) {
        this.gradeAppliedFor = gradeAppliedFor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
