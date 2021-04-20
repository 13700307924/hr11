package com.kgc.sun.hr.service.impl;


import com.kgc.sun.hr.mapper.UserMapper;
import com.kgc.sun.hr.pojo.Users;
import com.kgc.sun.hr.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public Users find(String userName, String userPwd) throws Exception {
        return this.userMapper.select(userName,userPwd);
    }
}
