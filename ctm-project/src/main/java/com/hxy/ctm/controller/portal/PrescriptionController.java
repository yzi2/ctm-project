package com.hxy.ctm.controller.portal;

import com.hxy.ctm.common.Const;
import com.hxy.ctm.common.ResponseCode;
import com.hxy.ctm.common.ServerResponse;
import com.hxy.ctm.pojo.User;
import com.hxy.ctm.service.IPrescriptionService;
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
 * @date 2018/6/10 下午8:00
 */
@Controller
@RequestMapping(value = "/user/prescription", method = {RequestMethod.POST, RequestMethod.GET})
public class PrescriptionController {
    @Autowired
    private IPrescriptionService iPrescriptionService;

    @ResponseBody
    @RequestMapping("/list")
    public ServerResponse prescriptionList(HttpSession session,
                                           @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                           @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录");
        }
        return iPrescriptionService.manageList(pageNum, pageSize);
    }

    @RequestMapping("detail")
    @ResponseBody
    public ServerResponse getPrescriptionDetail(HttpSession session, int id) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录");
        }
        return iPrescriptionService.managePrescriptionDetail(id);
    }

    @ResponseBody
    @RequestMapping("search")
    public ServerResponse searchPrescription(HttpSession session, String prescriptionName,
                                             @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                             @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录");
        }
        return iPrescriptionService.searchPrescription(prescriptionName, pageNum, pageSize);
    }
}