package com.kgc.sun.hr.mapper;


import com.kgc.sun.hr.pojo.Users;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 登录验证
     * @param userName
     * @param userPwd
     * @return
     * @throws Exception
     */
    Users select(@Param("userName")String userName, @Param("userPwd")String userPwd)throws Exception;
}
