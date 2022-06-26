package com.twk.service;

import com.twk.pojo.User;

import java.util.Random;
import java.util.UUID;

public class UserServiceImpl implements UserService {
    @Override
    public User getUserNameById(Integer id) {
        User user = User.builder().id(id).name("twk11").sex(true).build();
        System.out.println("客户端查询了"+id+"用户");
        return user;
    }

    @Override
    public int insertUserById(User user) {
        System.out.println("插入数据成功:" + user);
        return 1;
    }
}
