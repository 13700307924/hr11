package com.kgc.sun.hr.service;

import com.kgc.sun.hr.pojo.Resume;

import java.util.List;

public interface ResumeService {
  List<Resume>findAll(Resume resume)throws Exception;
}
