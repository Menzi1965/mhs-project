package com.mhs.spring.project.mhs_project.dto;

import com.mhs.spring.project.mhs_project.entities.Student;
import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
@Data
public class ApplicationDto {

    private String reason;

    private String status;

    private int gradeAppliedFor;

    private Student student;


}
