package com.kgc.sun.hr.service.impl;

import com.kgc.sun.hr.mapper.ResumeMapper;
import com.kgc.sun.hr.pojo.Resume;
import com.kgc.sun.hr.service.ResumeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class ResumeServiceImpl implements ResumeService {
  @Resource
  private ResumeMapper resumeMapper;
  @Override
  public List<Resume> findAll(Resume resume) throws Exception {
    return this.resumeMapper.selectAll(resume);
  }
}
