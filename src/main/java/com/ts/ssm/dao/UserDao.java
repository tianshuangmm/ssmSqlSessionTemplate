package com.ts.ssm.dao;

import com.ts.ssm.bean.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public User getUser(Integer id){
       User user= sqlSessionTemplate.selectOne("user.select",id);
       return user;
    }
}
