package com.admin.service;

import com.admin.domain.model.WxUser;

import java.util.List;

public interface WxUserService {

    WxUser autoInserWxUser(WxUser wxUser);

    List<WxUser> selectFriendById( WxUser wxUser);
}

