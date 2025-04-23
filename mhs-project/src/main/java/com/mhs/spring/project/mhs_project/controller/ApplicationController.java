package com.mhs.spring.project.mhs_project.controller;

import com.mhs.spring.project.mhs_project.dto.ApplicationDto;
import com.mhs.spring.project.mhs_project.entities.Application;
import com.mhs.spring.project.mhs_project.entities.Grade;
import com.mhs.spring.project.mhs_project.entities.Person;
import com.mhs.spring.project.mhs_project.service.impl.ApplicationServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mhs")
public class ApplicationController {

    private final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    private final ApplicationServiceImpl applicationService;

    public ApplicationController(ApplicationServiceImpl applicationService) {
        this.applicationService = applicationService;
    }


    @PostMapping("/application")
    public ResponseEntity<Application> studentApplication(@RequestBody ApplicationDto application)throws Exception{
        try {
            if(application==null || application.toString().isEmpty()) {
                LOGGER.error("Can't create an empty person");
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            else{
                final Application createdApplication = applicationService.createApplication(application);
            LOGGER.info("A person has been created {}",createdApplication);
            return new ResponseEntity<>(createdApplication, HttpStatus.CREATED);
            }

        }
        catch (Exception e){
            LOGGER.error("can't proceed with request",e );
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }

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
