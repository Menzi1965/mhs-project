package com.mhs.spring.project.mhs_project.controller;

import com.mhs.spring.project.mhs_project.dto.PersonDto;
import com.mhs.spring.project.mhs_project.entities.Person;
import com.mhs.spring.project.mhs_project.service.impl.PersonServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PersonController {

    private final PersonServiceImpl personService;
    private final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);




    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @PostMapping("createPerson")
    public ResponseEntity<Person> createPerson(@RequestBody PersonDto personDto)throws Exception{
        try {
            if(personDto==null || personDto.toString().isEmpty()) {
                LOGGER.error("Can't create an empty person");
            }
            final Person createdPerson= personService.createPerson(personDto);
            LOGGER.info("A person has been created",createdPerson);
            return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);

        }
        catch (Exception e){
            LOGGER.error("can't proceed with request",e );
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }
    }
}
