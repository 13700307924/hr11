package com.kgc.sun.hr.mapper;

import com.kgc.sun.hr.pojo.Resume;

import java.util.*;

public interface ResumeMapper {
  List<Resume>selectAll(Resume resume)throws Exception;
}
