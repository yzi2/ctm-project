package com.hxy.ctm.controller.backend;

import com.hxy.ctm.common.Const;
import com.hxy.ctm.common.ServerResponse;
import com.hxy.ctm.dao.UserMapper;
import com.hxy.ctm.pojo.User;
import com.hxy.ctm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author tengfei
 * @version 1.0
 * @date 2018/5/23 下午3:53
 */
@RequestMapping(value = "/manage/user",method = {RequestMethod.GET,RequestMethod.POST})
@Controller
public class UserManageController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("login")
    @ResponseBody
    public ServerResponse<User> login(String loginName, String password, HttpSession session){
        ServerResponse<User> response = iUserService.login(loginName,password);
        if(response.isSuccess()){
            User user = response.getData();
            if(user.getRole() == Const.Role.ROLE_ADMIN){
                //说明登录的是管理员
                session.setAttribute(Const.CURRENT_USER,user);
                return response;
            }else{
                return ServerResponse.createByErrorMessage("不是管理员,无法登录");
            }
        }
        return response;
    }
}
