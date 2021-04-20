package com.kgc.sun.hr.service.impl;

import com.kgc.sun.hr.mapper.Interview_stateMapper;
import com.kgc.sun.hr.pojo.Interview_state;
import com.kgc.sun.hr.service.Interview_stateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class Interview_stateServiceImpl implements Interview_stateService {
    @Resource
    private Interview_stateMapper interview_stateMapper;
    @Override
    public List<Interview_state> findAll() throws Exception {
        return this.interview_stateMapper.selectAll();
    }
}
