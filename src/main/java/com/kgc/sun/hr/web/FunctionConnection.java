package com.kgc.sun.hr.web;


import com.kgc.sun.hr.pojo.Functions;
import com.kgc.sun.hr.service.FunctionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/function")
public class FunctionConnection {
    @Resource
    private FunctionService functionService;
    @RequestMapping("/findFunction")
    public String findFunction(Integer roleId, Model model)throws Exception{
        List<Functions> functionList = this.functionService.findFunction(roleId,1);
        model.addAttribute("functionList",functionList);
        return "index";
    }
}
