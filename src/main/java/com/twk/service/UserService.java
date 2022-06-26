package com.twk.service;

import com.twk.pojo.User;

public interface UserService {
    User getUserNameById(Integer id);
    int insertUserById(User user);
}
