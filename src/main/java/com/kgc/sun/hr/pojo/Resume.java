package com.kgc.sun.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resume {
    private Long resumeId;
    private Properties jobTitle;//职位名称
    private String name;//姓名
    private Long sex;//性别
    private String email;//Email
    private String phone;//电话
    private String address;//住址
    private String residence;//户口所在地
    private String politicsStatus;//政治面貌
    private String IDCard;//身份证号码
    private String graduation;//毕业院校
    private Education education;//学历
    private String specialty;//专业
    private String workEXP;//工作经验
    private Long incumbency;//是否在职
    private Long fresh;//是否应届生
    private String remuneration;//薪酬要求
    private Long recruitmentType;//招聘类型
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationTime;//登记时间
    private String record;//个人履历
    private String accessory;//简历附件
    private Interview_state recommend;//面试状态
    private Long referrer;//推荐人
    private Date recommendTime;//推荐时间
    private String opintion;//推荐面试意见
}
