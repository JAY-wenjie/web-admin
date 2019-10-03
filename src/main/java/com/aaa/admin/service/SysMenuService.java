package com.aaa.admin.service;

import com.aaa.admin.domain.model.SysMenu;

import java.util.List;

public interface SysMenuService {


    int deleteByPrimaryKey(Integer id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> selectAllMenus();

}


