package com.hxy.ctm.service;

import com.github.pagehelper.PageInfo;
import com.hxy.ctm.common.ServerResponse;
import com.hxy.ctm.pojo.Medicinal;

/**
 * @author tengfei
 * @version 1.0
 * @date 2018/6/10 下午8:12
 */
public interface IMedicinalService {

    ServerResponse<PageInfo> manageList(int pageNum, int pageSize);

    ServerResponse saveOrUpdateMedicinal(Medicinal medicinal);

    ServerResponse<Medicinal> manageMedicinalDetail(int id);

    ServerResponse searchMedicinal(String medicinalName, int pageNum, int pageSize);

    ServerResponse deleteMedicinal(int medicinalId);
}