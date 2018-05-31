package com.hxy.ctm.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String userName;

    private String loginName;

    private String password;

    private String telphone;

    private String email;

    private Integer status;

    private Integer role;

    private Date createTime;

    private Date modifyTime;

    public User(Integer id, String userName, String loginName, String password, String telphone, String email, Integer status, Integer role, Date createTime, Date modifyTime) {
        this.id = id;
        this.userName = userName;
        this.loginName = loginName;
        this.password = password;
        this.telphone = telphone;
        this.email = email;
        this.status = status;
        this.role = role;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    public User() {
        super();
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
        this.userName = userName == null ? null : userName.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}