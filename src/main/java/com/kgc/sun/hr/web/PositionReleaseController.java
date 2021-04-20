package com.kgc.sun.hr.web;

import com.kgc.sun.hr.pojo.Functions;
import com.kgc.sun.hr.pojo.JobpoString;
import com.kgc.sun.hr.pojo.Users;
import com.kgc.sun.hr.service.FunctionService;
import com.kgc.sun.hr.service.JobpoStingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/positionRelease")
public class PositionReleaseController {
    @Resource
    private FunctionService functionService;
    @Resource
    private JobpoStingService jobpoStingService;
    @RequestMapping("/show")
    public String show(HttpSession session, Model model)throws Exception{
        Users user = (Users) session.getAttribute("user");
        List<Functions> functionList = this.functionService.findFunction(user.getRole().getRoleId(),1);
        model.addAttribute("functionList",functionList);
        List<JobpoString> jobpoStringList = this.jobpoStingService.selectAll();
        model.addAttribute("jobpoStringList",jobpoStringList);
        return "positionRelease/show";
    }
}
