package com.mhs.spring.project.mhs_project.repository;

import com.mhs.spring.project.mhs_project.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
}
