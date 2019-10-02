package com.admin.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.admin.domain.mapper.UserQrcodeMapper;
import com.admin.service.UserQrcodeService;
@Service
public class UserQrcodeServiceImpl implements UserQrcodeService{

    @Resource
    private UserQrcodeMapper userQrcodeMapper;


}
