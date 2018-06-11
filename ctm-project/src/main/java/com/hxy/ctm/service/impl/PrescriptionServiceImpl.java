package com.hxy.ctm.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hxy.ctm.common.ResponseCode;
import com.hxy.ctm.common.ServerResponse;
import com.hxy.ctm.dao.PrescriptionMapper;
import com.hxy.ctm.pojo.Prescription;
import com.hxy.ctm.service.IPrescriptionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tengfei
 * @version 1.0
 * @date 2018/6/7 下午10:29
 */
@Service
public class PrescriptionServiceImpl implements IPrescriptionService {
    @Autowired
    private PrescriptionMapper prescriptionMapper;

    @Override
    public ServerResponse<PageInfo> manageList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Prescription> orderList = prescriptionMapper.selectAllPrescription();
        PageInfo pageResult = new PageInfo(orderList);
        return ServerResponse.createBySuccess(pageResult);
    }

    @Override
    public ServerResponse saveOrUpdatePrescription(Prescription prescription) {
        if (prescription != null) {
            if (prescription.getId() != null) {
                int rowCount = prescriptionMapper.updateByPrimaryKey(prescription);
                if (rowCount > 0) {
                    return ServerResponse.createBySuccess("更新药方成功");
                }
                return ServerResponse.createBySuccess("更新药方失败");
            } else {
                int rowCount = prescriptionMapper.insert(prescription);
                if (rowCount > 0) {
                    return ServerResponse.createBySuccess("新增药方成功");
                }
                return ServerResponse.createBySuccess("新增药方失败");
            }
        }
        return ServerResponse.createByErrorMessage("新增或更新药方参数不正确");
    }

    @Override
    public ServerResponse<Prescription> managePrescriptionDetail(int prescriptionId) {
        if (prescriptionId == 0) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        Prescription prescription = prescriptionMapper.selectByPrimaryKey(prescriptionId);
        if (prescription == null) {
            return ServerResponse.createByErrorMessage("药方不存在或者已删除");
        }
        return ServerResponse.createBySuccess(prescription);
    }

    @Override
    public ServerResponse searchPrescription(String prescriptionName, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        if (StringUtils.isNotBlank(prescriptionName)) {
            prescriptionName = new StringBuilder().append("%").append(prescriptionName).append("%").toString();
        }
        List<Prescription> prescriptionList = prescriptionMapper.selectByPrescriptionName(prescriptionName);
        PageInfo pageResult = new PageInfo(prescriptionList);
        return ServerResponse.createBySuccess(pageResult);
    }

    @Override
    public ServerResponse deletePrescription(int prescriptionId) {
        if (prescriptionId == 0) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        int rowCount = prescriptionMapper.deleteByPrimaryKey(prescriptionId);
        if (rowCount > 0) {
            return ServerResponse.createBySuccess("删除药方成功");
        }
        return ServerResponse.createBySuccess("删除药方失败");

    }
}