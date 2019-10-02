package com.admin.domain.mapper;

import com.admin.domain.model.Message;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MessageMapper extends Mapper<Message> {
    List<Message> selectMessageByGroup(@Param("group") int group);
}