package com.ts.ssm.controller;

import com.ts.ssm.bean.User;
import com.ts.ssm.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/hello/{id}")
    @ResponseBody
    public User hello(@PathVariable Integer id){
        return userDao.getUser(id);
    }
}
