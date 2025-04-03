package com.mhs.spring.project.mhs_project.controller;

import com.mhs.spring.project.mhs_project.dto.ApplicationDto;
import com.mhs.spring.project.mhs_project.entities.Application;
import com.mhs.spring.project.mhs_project.entities.Grade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mhs/")
public class ApplicationController {



    @PostMapping("/application")
    public ResponseEntity<Application> studentApplication(ApplicationDto application){
        return null;
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApplication(@PathVariable int id){
        return null;
    }


    @GetMapping("/available_grades")
    public ResponseEntity<Grade> availableGrades(){
        return null;

    }

    @GetMapping("/submitted_applications")
    public ResponseEntity<Application> submittedApplications(){
        return null;

    }

    @GetMapping("/application/status")
    public ResponseEntity<Application> applicationStatus(ApplicationDto applicationDto){
        return null;
    }


}
