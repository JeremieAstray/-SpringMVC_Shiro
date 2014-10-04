package com.etop.service;

import com.etop.basic.service.BaseService;
import com.etop.dao.FunctionDAO;
import com.etop.pojo.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jeremie on 2014/10/1.
 */
@Service("FunctionService")
public class FunctionService extends BaseService {

    @Autowired
    private FunctionDAO functionDAO;

    /**
     * 查找所有权限过滤信息
     * @return
     */
    public List<Function> findAll() {
        return functionDAO.find("from Function f");
    }
}
