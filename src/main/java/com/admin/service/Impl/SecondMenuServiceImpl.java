package com.admin.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.admin.domain.mapper.SecondMenuMapper;
import com.admin.service.SecondMenuService;
@Service
public class SecondMenuServiceImpl implements SecondMenuService{

    @Resource
    private SecondMenuMapper secondMenuMapper;

}
