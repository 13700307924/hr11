package com.kgc.sun.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private String userName;
    private Role role;
    private Employee employee;
    private String userPwd;
    private Department department;

}
