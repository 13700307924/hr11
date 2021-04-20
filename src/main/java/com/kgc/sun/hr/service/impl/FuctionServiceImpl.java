package com.kgc.sun.hr.service.impl;


import com.kgc.sun.hr.mapper.FunctionMapper;
import com.kgc.sun.hr.pojo.Functions;
import com.kgc.sun.hr.service.FunctionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class FuctionServiceImpl implements FunctionService {
    @Resource
    private FunctionMapper functionMapper;
    @Override
    public List<Functions> findFunction(Integer roleCode, Integer parentFunctionId) throws Exception {
        List<Functions> functions = this.functionMapper.selectFunctions(roleCode, parentFunctionId);
        if(functions!=null && functions.size()>0){
            for (Functions f:functions) {
                f.setChildren(this.findFunction(roleCode,f.getFunctionId()));
            }
        }else {
            functions=null;
        }
        return functions;
    }
}
