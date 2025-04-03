package com.mhs.spring.project.mhs_project.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
@Data

public class PersonDto {

    private String name;

    private String surname;

    private int IdNo;

    private String gender;

}
