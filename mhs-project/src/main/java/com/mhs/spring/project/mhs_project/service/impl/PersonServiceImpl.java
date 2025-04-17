package com.mhs.spring.project.mhs_project.service.impl;

import com.mhs.spring.project.mhs_project.dto.PersonDto;
import com.mhs.spring.project.mhs_project.entities.Person;
import com.mhs.spring.project.mhs_project.repository.PersonRepository;
import com.mhs.spring.project.mhs_project.service.PersonService;
import org.springframework.stereotype.Service;

@Service

public class PersonServiceImpl implements PersonService {

    public final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person createPerson(PersonDto personDto) {
        Person  person= new Person(
                personDto.getName(),
                personDto.getSurname(),
                personDto.getIdNo(),
                personDto.getGender());

        return personRepository.save(person);


    }
}
