package com.kgc.sun.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Department {
    private Integer deptId;
    private String deptName;
    //一个部门有属于上级部门
    private Department parentDeparment;
}
