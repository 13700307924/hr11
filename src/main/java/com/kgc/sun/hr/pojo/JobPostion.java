package com.kgc.sun.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPostion {
    private Long jobpostId;
    private Long department;
    private Long recruitmentType;
    private Integer recruitingNumbers;
    private Long jobTitle;
    private String registrar;
    private Date registrationTime;
    private Date expirationDate;
    private String jobDescription;
    private String Jobrequirement;
}
