package com.project.service.serviceImpl;

import com.project.data.entity.User;
import com.project.data.mapper.UserMapper;
import com.project.service.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User hello() {
        return userMapper.findByName("张三");
    }
}
