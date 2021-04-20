package com.kgc.sun.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Properties {
    private Long poId;
    private String positionCode;
    private String positionName;
    private Position positionId;
    private Long departmentId;
    private String positionDesc;
    private String remarks;
    private Long enable;
}
