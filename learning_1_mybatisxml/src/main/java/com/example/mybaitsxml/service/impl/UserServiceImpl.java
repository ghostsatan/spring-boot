package com.example.mybaitsxml.service.impl;

import com.example.mybaitsxml.dao.entity.User;

import com.example.mybaitsxml.dao.mapper.UserMapper;
import com.example.mybaitsxml.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUsers() {
        log.info("/queryAllUsers start...");
        return userMapper.queryAllUsers();
    }

    @Override
    public User queryByAge(Integer age) {

        return userMapper.queryByAge(age);
    }

    @Override
    public void inserUser(User user) {
        userMapper.inserUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateUserById(user);

    }

}
