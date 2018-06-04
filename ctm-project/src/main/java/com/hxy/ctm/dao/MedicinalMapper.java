package com.hxy.ctm.dao;

import com.hxy.ctm.pojo.Medicinal;

public interface MedicinalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Medicinal record);

    int insertSelective(Medicinal record);

    Medicinal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Medicinal record);

    int updateByPrimaryKey(Medicinal record);
}