package com.hxy.ctm.dao;

import com.hxy.ctm.pojo.Prescription;

import java.util.List;

public interface PrescriptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Prescription record);

    int insertSelective(Prescription record);

    Prescription selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Prescription record);

    int updateByPrimaryKey(Prescription record);

    List<Prescription> selectAllPrescription();

    List<Prescription> selectByPrescriptionName(String prescriptionName);
}