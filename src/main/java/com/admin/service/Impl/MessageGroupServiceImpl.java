package com.admin.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.admin.domain.mapper.MessageGroupMapper;
import com.admin.service.MessageGroupService;
@Service
public class MessageGroupServiceImpl implements MessageGroupService{

    @Resource
    private MessageGroupMapper messageGroupMapper;

}
