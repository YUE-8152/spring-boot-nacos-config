package com.spring.boot.nacos.service.impl;

import com.spring.boot.nacos.dao.SysUserMapper;
import com.spring.boot.nacos.model.SysUser;
import com.spring.boot.nacos.service.SysUserService;
import com.spring.boot.nacos.common.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @Author: YUEXIN
 * @Date: 2020-06-12 17:06:54
 */
@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

}
