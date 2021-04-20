package com.kgc.sun.hr.mapper;


import com.kgc.sun.hr.pojo.Functions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FunctionMapper {
    List<Functions>selectFunctions(@Param("roleId")Integer roleId, @Param("parentFunctionId")Integer parentFunctionId)throws Exception;
}
