package com.example.springboot_shiro.service;

import com.example.springboot_shiro.bean.shiro.User;

public interface LoginService {

    User getUserByName(String userName);
}
