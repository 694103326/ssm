package com.husky.controller;

import com.husky.dao.UserMapper;
import com.husky.po.User;

import com.husky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("queryUserById")
    @ResponseBody
    public User queryUserById(int id) throws Exception {
        return userService.queryById(id);
    }
}