package com.kgc.sun.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//学历列表
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Education {
    private Long educationId;
    private String educationName;//学历名称
}
