package com.kgc.sun.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer empId;
    private List<Department> deptId;
    private String empName;
    private Date hireDate;//入职时间
    private String status;//状态 1 2 3
    private Date fireDate;//离职时间
    private Department department;
}
