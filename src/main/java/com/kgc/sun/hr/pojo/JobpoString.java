package com.kgc.sun.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class JobpoString {
    private Long jobpostId;
    private Department department;
    private Long recuritmentType;
    private Integer recruitingNumbers;
    private Properties jobTitle;
    private String registrar;
    private Date registrationTime;
    private Date expirationDate;
    private String jobDescription;
    private String Jobrequirement;
}
