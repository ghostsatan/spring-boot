package com.example.mybaitsxml.dao.mapper;


import com.example.mybaitsxml.dao.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> queryAllUsers();
    User  queryByAge(Integer age);

    void inserUser(User user);

    void deleteUserById(Integer id);

    void updateUserById(User user);

}

