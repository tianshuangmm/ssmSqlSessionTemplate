package com.ts.ssm.bean;

import java.util.Date;

public class User {
    private Integer id;
    private String userName;
    private String sex;
    private Integer age;
    private Date date;

    public User() {
    }

    public User( String userName, String sex, Integer age, Date date) {
        this.userName = userName;
        this.sex = sex;
        this.age = age;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
