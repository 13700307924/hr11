package com.kgc.sun.hr.web;

import com.kgc.sun.hr.pojo.*;
import com.kgc.sun.hr.service.FunctionService;
import com.kgc.sun.hr.service.Interview_stateService;
import com.kgc.sun.hr.service.PropertiesService;
import com.kgc.sun.hr.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
@RequestMapping("/curriculumVitae")
public class curriculumVitaeController {
    @Resource
    private FunctionService functionService;
    @Resource
    private PropertiesService propertiesService;
    @Resource
    private Interview_stateService interview_stateService;
    @Resource
    private ResumeService resumeService;
    @RequestMapping("/show")
    public String show(HttpSession session, Model model, Resume resume)throws Exception{
        Users user = (Users) session.getAttribute("user");
        List<Functions> functionList = this.functionService.findFunction(user.getRole().getRoleId(),1);
        model.addAttribute("functionList",functionList);
        List<Interview_state> interview_stateList = this.interview_stateService.findAll();
        model.addAttribute("interview_stateList",interview_stateList);
        List<Resume> resumeList = this.resumeService.findAll(resume);
        model.addAttribute("resumeList",resumeList);
        return "curriculumVitae/show";
    }
}
