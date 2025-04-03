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
        Person  person= Person.builder()
                .name(personDto.getName())
                .surname(personDto.getSurname())
                .idNo(personDto.getIdNo())
                .gender(personDto.getGender())
                .build();

        return personRepository.save(person);


    }
}
