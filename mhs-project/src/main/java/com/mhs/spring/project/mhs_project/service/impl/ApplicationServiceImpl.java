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

        Application application= new Application(applDto.getGradeAppliedFor(), applDto.getReason(), applDto.getStatus(), applDto.getStudent());

       return applicationRepository.save(application);








    }
}
