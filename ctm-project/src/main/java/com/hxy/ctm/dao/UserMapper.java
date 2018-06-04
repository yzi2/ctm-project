package com.hxy.ctm.dao;

import com.hxy.ctm.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkLoginName(String loginName);

    int checkEmail(String email);

    int checkEmailByUserId(@Param("email") String email,@Param("userId") int userId);

    int checkTelPhone(String telphone);

    int checkTelPhoneByUserId(@Param("telphone") String telphoen,@Param("userId") int userId);

    int checkPassword(@Param("password") String password,@Param("userId") int userId);

    User selectLogin(@Param("loginName") String loginName,@Param("password") String password);
}