package com.hxy.ctm.service;


import com.github.pagehelper.PageInfo;
import com.hxy.ctm.common.ServerResponse;
import com.hxy.ctm.pojo.Prescription;

/**
 * @author tengfei
 * @version 1.0
 * @date 2018/6/7 下午10:28
 */
public interface IPrescriptionService {

    ServerResponse<PageInfo> manageList(int pageNum, int pageSize);

    ServerResponse saveOrUpdatePrescription(Prescription prescription);

    ServerResponse<Prescription> managePrescriptionDetail(int prescriptionId);

    ServerResponse searchPrescription(String prescriptionName, int pageNum, int pageSize);

    ServerResponse deletePrescription(int prescriptionId);
}
