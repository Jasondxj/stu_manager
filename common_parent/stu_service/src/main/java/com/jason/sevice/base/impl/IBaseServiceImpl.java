package com.jason.sevice.base.impl;

import com.jason.mapper.UserMapper;
import com.jason.sevice.base.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class IBaseServiceImpl<T> implements IBaseService<T>{
    //统一管理dao
    @Autowired
    protected UserMapper userMapper;
}
