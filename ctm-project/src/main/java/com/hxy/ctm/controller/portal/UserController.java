package com.hxy.ctm.controller.portal;

import com.hxy.ctm.common.Const;
import com.hxy.ctm.common.ResponseCode;
import com.hxy.ctm.common.ServerResponse;
import com.hxy.ctm.pojo.User;
import com.hxy.ctm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author hxy
 * @version 1.0
 * @date 2018/5/22 下午2:48
 */
@Controller
@RequestMapping(value = "/user", method = {RequestMethod.POST, RequestMethod.GET})
public class UserController {
    @Autowired
    private IUserService iUserService;

    @ResponseBody
    @RequestMapping(value = "/register")
    public ServerResponse<String> register(@ModelAttribute User user) {
        System.out.println(user);
        return iUserService.register(user);
    }

    @ResponseBody
    @RequestMapping(value = "/login")
    public ServerResponse<User> login(String email, String password, HttpSession session) {
        ServerResponse<User> response = iUserService.login(email, password);
        if (response.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, response.getData());
        }
        return response;
    }





    @ResponseBody
    @RequestMapping("/resetPassword")
    public ServerResponse<String> resetPassword(String passwordOld, String passwordNew, HttpSession session) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        return iUserService.resetPassword(passwordOld, passwordNew, user);
    }

    @ResponseBody
    @RequestMapping("getInformation")
    public ServerResponse<User> getInformation(HttpSession session){
        User currentUser = (User)session.getAttribute(Const.CURRENT_USER);
        if(currentUser == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"未登录,需要强制登录status=10");
        }
        return iUserService.getInformation(currentUser.getId());
    }

    @ResponseBody
    @RequestMapping("updateInformation")
    public ServerResponse<User> updateInformation(HttpSession session,User user){
        User currentUser = (User)session.getAttribute(Const.CURRENT_USER);
        if(currentUser == null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        user.setId(currentUser.getId());
        user.setLoginName(currentUser.getLoginName());
        user.setUserName(currentUser.getUserName());
        ServerResponse<User> response = iUserService.updateInformation(user);
        if(response.isSuccess()){
            response.getData().setLoginName(currentUser.getLoginName());
            response.getData().setUserName(currentUser.getUserName());
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }
}
