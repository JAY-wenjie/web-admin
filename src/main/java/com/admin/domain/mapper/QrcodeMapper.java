package com.admin.domain.mapper;

import com.admin.domain.model.Qrcode;
import com.admin.domain.model.WxUser;
import org.apache.ibatis.annotations.Param;

public interface QrcodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Qrcode record);

    int insertSelective(Qrcode record);
    Qrcode selectByPrimaryKey(@Param("wxUser") WxUser wxUser);
    int updateByPrimaryKeySelective(Qrcode record);

    int updateByPrimaryKey(Qrcode record);
}