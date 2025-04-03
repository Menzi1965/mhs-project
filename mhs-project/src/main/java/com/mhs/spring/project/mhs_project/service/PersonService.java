package com.mhs.spring.project.mhs_project.service;

import com.mhs.spring.project.mhs_project.dto.PersonDto;
import com.mhs.spring.project.mhs_project.entities.Person;

public interface PersonService {

    public Person createPerson(PersonDto personDto);
}
