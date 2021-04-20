package com.kgc.sun.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private List<Functions> functionsList;
}
