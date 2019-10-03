package com.aaa.admin.domain.mapper;

import com.aaa.admin.domain.model.ScoreInfo;

public interface ScoreInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScoreInfo record);

    int insertSelective(ScoreInfo record);

    ScoreInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ScoreInfo record);

    int updateByPrimaryKey(ScoreInfo record);
}