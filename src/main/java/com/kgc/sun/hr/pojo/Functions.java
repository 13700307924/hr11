package com.kgc.sun.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Functions {
    private Boolean open=true;
    private Integer functionId;
    private Functions parentFunction;
    private String name;
    private String functionUrl;
    private String functionDesc;
    private List<Functions>children;
    private List<Role>roleList;



}
