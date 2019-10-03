package com.aaa.admin.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.aaa.admin.domain.mapper.SysMenuMapper;
import com.aaa.admin.domain.model.SysMenu;
import com.aaa.admin.service.SysMenuService;

import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Resource
    private SysMenuMapper sysMenuMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysMenuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysMenu record) {
        return sysMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(SysMenu record) {
        return sysMenuMapper.insertSelective(record);
    }

    @Override
    public SysMenu selectByPrimaryKey(Integer id) {
        return sysMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysMenu record) {
        return sysMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysMenu record) {
        return sysMenuMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SysMenu> selectAllMenus() {
        return sysMenuMapper.selectAllMenus();
    }

}


