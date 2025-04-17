package com.mhs.spring.project.mhs_project.dto;

import com.mhs.spring.project.mhs_project.entities.Student;
import lombok.*;
import org.springframework.stereotype.Component;


public class ApplicationDto {

    private String reason;

    private String status;

    private int gradeAppliedFor;

    private Student student;

    public ApplicationDto(String reason, String status, int gradeAppliedFor, Student student) {
        this.reason = reason;
        this.status = status;
        this.gradeAppliedFor = gradeAppliedFor;
        this.student = student;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGradeAppliedFor() {
        return gradeAppliedFor;
    }

    public void setGradeAppliedFor(int gradeAppliedFor) {
        this.gradeAppliedFor = gradeAppliedFor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
