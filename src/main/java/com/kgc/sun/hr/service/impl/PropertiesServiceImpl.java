package com.kgc.sun.hr.service.impl;

import com.kgc.sun.hr.mapper.PropertiesMapper;
import com.kgc.sun.hr.pojo.Properties;
import com.kgc.sun.hr.service.PropertiesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class PropertiesServiceImpl implements PropertiesService {
    @Resource
    private PropertiesMapper propertiesMapper;
    @Override
    public List<Properties> findAll() throws Exception {
        return this.propertiesMapper.selectAll();
    }
}
