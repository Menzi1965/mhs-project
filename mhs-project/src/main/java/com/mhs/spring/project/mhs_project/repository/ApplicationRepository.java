package com.mhs.spring.project.mhs_project.repository;

import com.mhs.spring.project.mhs_project.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {

}
