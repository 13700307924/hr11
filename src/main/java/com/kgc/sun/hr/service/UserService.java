package com.kgc.sun.hr.service;


import com.kgc.sun.hr.pojo.Users;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    final String LOGINUSER = "user";

    Users find(@Param("userName")String userName, @Param("userPwd")String userPwd)throws Exception;

}
