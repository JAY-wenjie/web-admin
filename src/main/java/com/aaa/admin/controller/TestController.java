package com.aaa.admin.controller;

import com.aaa.admin.commons.JsonBean;
import com.aaa.admin.domain.model.SysMenu;
import com.aaa.admin.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    SysMenuService sysMenuService;

    @RequestMapping("index")
    public JsonBean index() {
        List<SysMenu> sysMenuList = sysMenuService.selectAllMenus();
       JsonBean jsonBean =  new JsonBean(0,sysMenuList,"success");
        return jsonBean;
    }

}
