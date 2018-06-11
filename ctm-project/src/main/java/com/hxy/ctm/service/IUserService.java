package com.hxy.ctm.service;

import com.hxy.ctm.common.ServerResponse;
import com.hxy.ctm.pojo.User;

/**
 * @author hxy
 * @version 1.0
 * @date 2018/5/22 下午2:49
 */
public interface IUserService {
    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    ServerResponse<User> login(String loginName,String password);

    ServerResponse<String> resetPassword(String passwordOld,String passwordNew ,User user);

    ServerResponse<User> getInformation(int userId);

    ServerResponse<User> updateInformation(User user);

    ServerResponse checkAdminRole(User user);

}