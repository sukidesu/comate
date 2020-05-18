package net.ifsoft.comate.controller;

import net.ifsoft.comate.dao.SysUserRepsitory;
import net.ifsoft.comate.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserController {

    @Autowired
    SysUserRepsitory sysUserRepsitory;

    @GetMapping("/list")
    public List<SysUser> list(){
        return sysUserRepsitory.findAll();
    }
}
