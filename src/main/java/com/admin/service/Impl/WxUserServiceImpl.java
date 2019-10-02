package com.admin.service.Impl;

import com.admin.domain.mapper.WxUserMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.admin.domain.model.WxUser;
import com.admin.service.WxUserService;

import java.util.List;

@Service
public class WxUserServiceImpl implements WxUserService {

    @Resource
    private WxUserMapper wxUserMapper;

    /**
     * 获取用户信息后根据库中是否存在来进行增加和更新操作
     * @param wxUser
     * @return
     */
    @Override
    public WxUser autoInserWxUser(WxUser wxUser) {
        WxUser ddwxUser = wxUserMapper.selectByPrimaryKey(wxUser.getOpenid());
        System.out.println(ddwxUser.toString());
        if (ddwxUser==null) {
            System.out.println("增加开始");
            int result = wxUserMapper.insertSelective(wxUser);
            System.out.println("增加+++++++++++++++++++++++++++++++++++++" + result);
        } else {
            System.out.println("更新开始");
            int result = wxUserMapper.updateByPrimaryKeySelective(wxUser);
            System.out.println("更新+++++++++++++++++++++++++++++++++++++" + result);
            wxUser = ddwxUser;
        }
        System.out.println("完整的用户数据"+wxUser.toString());
        return wxUser;
    }

    @Override
    public List<WxUser> selectFriendById(WxUser wxUser) {
        return wxUserMapper.selectFriendById(wxUser);
    }


}

