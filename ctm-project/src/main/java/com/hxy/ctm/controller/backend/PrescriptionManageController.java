package com.hxy.ctm.controller.backend;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hxy.ctm.common.Const;
import com.hxy.ctm.common.ResponseCode;
import com.hxy.ctm.common.ServerResponse;
import com.hxy.ctm.pojo.Prescription;
import com.hxy.ctm.pojo.User;
import com.hxy.ctm.service.IPrescriptionService;
import com.hxy.ctm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author tengfei
 * @version 1.0
 * @date 2018/6/7 下午10:23
 */
@Controller
@RequestMapping(value = "/manage/prescription",method = {RequestMethod.GET,RequestMethod.POST})
public class PrescriptionManageController {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private IPrescriptionService iPrescriptionService;

    @RequestMapping("list")
    @ResponseBody
    public ServerResponse<PageInfo> prescriptionList(HttpSession session,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                                     @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录管理员");
        }

        if (iUserService.checkAdminRole(user).isSuccess()) {
            //填充我们增加产品的业务逻辑
            return iPrescriptionService.manageList(pageNum, pageSize);
        } else {
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    @RequestMapping("save")
    @ResponseBody
    public ServerResponse prescriptionSave(HttpSession session, Prescription prescription) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录管理员");
        }
        if (iUserService.checkAdminRole(user).isSuccess()) {
            //填充我们增加产品的业务逻辑
            return iPrescriptionService.saveOrUpdatePrescription(prescription);
        } else {
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    @RequestMapping("detail")
    @ResponseBody
    public ServerResponse getPrescriptionDetail(HttpSession session, int id) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录管理员");
        }
        if (iUserService.checkAdminRole(user).isSuccess()) {
            return iPrescriptionService.managePrescriptionDetail(id);
        } else {
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    @ResponseBody
    @RequestMapping("search")
    public ServerResponse searchPrescription(HttpSession session, String prescriptionName,
                                             @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                             @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录管理员");
        }
        if (iUserService.checkAdminRole(user).isSuccess()) {
            //填充业务
            return iPrescriptionService.searchPrescription(prescriptionName, pageNum, pageSize);
        } else {
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    @ResponseBody
    @RequestMapping("delete")
    public ServerResponse deletePrescription(HttpSession session,int id){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录管理员");
        }
        if (iUserService.checkAdminRole(user).isSuccess()) {
            //填充业务
            return iPrescriptionService.deletePrescription(id);
        } else {
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }
}