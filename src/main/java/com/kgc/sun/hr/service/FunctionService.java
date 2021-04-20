package com.kgc.sun.hr.service;



import com.kgc.sun.hr.pojo.Functions;

import java.util.List;

public interface FunctionService {
    List<Functions> findFunction(Integer roleCode, Integer parentFunctionId)throws Exception;

}
