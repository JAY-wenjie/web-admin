package com.admin.domain.mapper;

import com.admin.domain.model.WxUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WxUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WxUser record);

    int insertSelective(WxUser record);

    WxUser selectByPrimaryKey(@Param("openid") String openid);

    int updateByPrimaryKeySelective(WxUser record);

    int updateByPrimaryKey(WxUser record);

    List<WxUser> selectFriendById(@Param("wxUser") WxUser wxUser);
}