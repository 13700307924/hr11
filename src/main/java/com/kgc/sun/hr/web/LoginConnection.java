package com.kgc.sun.hr.web;


import com.kgc.sun.hr.pojo.Users;
import com.kgc.sun.hr.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginConnection {
    @Resource
    private UserService userService;
    @PostMapping("/login")
    public String login(HttpSession session,String userName,String userPwd) throws Exception {
        Users users = this.userService.find(userName, userPwd);
        if (userName!=null && userName.trim().isEmpty()==false && userPwd!=null && userPwd.trim().isEmpty()==false){
            //session.user.employee.department.deptName

            session.setAttribute(UserService.LOGINUSER,users);
            return "redirect:function/findFunction?roleId="+users.getRole().getRoleId();
        }else{
            return "redirect:toLogin?flag=-1";
        }
    }
    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        session.invalidate();
        return "redirect:login";
    }
}
