package com.husky.service;

import com.husky.base.BaseService;
import com.husky.dao.UserMapper;
import com.husky.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService extends BaseService<User> {

    @Autowired
    private UserMapper userMapper;
}
