package com.kgc.sun.hr.service.impl;

import com.kgc.sun.hr.mapper.JobpoStingMapper;
import com.kgc.sun.hr.pojo.JobpoString;
import com.kgc.sun.hr.service.JobpoStingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class JobpoStingServiceImpl implements JobpoStingService {
    @Resource
    private JobpoStingMapper jobpoStingMapper;

    @Override
    public List<JobpoString> selectAll() throws Exception {
        return this.jobpoStingMapper.selectAll();
    }
}
