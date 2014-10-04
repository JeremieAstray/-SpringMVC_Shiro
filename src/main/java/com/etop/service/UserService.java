package com.etop.service;

import com.etop.basic.service.BaseService;
import com.etop.dao.UserDAO;
import com.etop.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Jeremie on 2014/9/30.
 */
@Service("UserService")
public class UserService extends BaseService {

    @Autowired
    private UserDAO userDAO;

    /**
     * 通过用户名查找用户信息
     * @param username
     * @return
     */
    public User findByName(String username){
        Map<String, Object> params = createParamMap();
        params.put("name",username);
        return userDAO.findUniqueResult("from User u where u.username = :name",params);
    }

    public List<User> getAllUser(){
        return userDAO.find("from User u");
    }
}
