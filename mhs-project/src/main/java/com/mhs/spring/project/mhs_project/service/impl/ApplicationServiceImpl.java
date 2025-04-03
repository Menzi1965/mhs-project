package com.mhs.spring.project.mhs_project.service.impl;


import com.mhs.spring.project.mhs_project.dto.ApplicationDto;
import com.mhs.spring.project.mhs_project.entities.Application;
import com.mhs.spring.project.mhs_project.repository.ApplicationRepository;
import com.mhs.spring.project.mhs_project.service.ApplicationService;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    public final ApplicationRepository applicationRepository;

    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public Application createApplication(ApplicationDto applDto) {

        Application application= Application.builder()
                .gradeAppliedFor(applDto.getGradeAppliedFor())
                .status(applDto.getStatus())
                .reason(applDto.getReason())
                .student(applDto.getStudent())
                .build();

        return application;









    }
}
