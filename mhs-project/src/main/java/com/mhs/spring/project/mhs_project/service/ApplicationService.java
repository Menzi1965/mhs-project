package com.mhs.spring.project.mhs_project.service;

import com.mhs.spring.project.mhs_project.dto.ApplicationDto;
import com.mhs.spring.project.mhs_project.entities.Application;

public interface ApplicationService {

    public Application createApplication(ApplicationDto applDto);

}
