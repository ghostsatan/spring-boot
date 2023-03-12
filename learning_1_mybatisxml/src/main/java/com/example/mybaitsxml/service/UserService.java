package com.example.mybaitsxml.service;
import com.example.mybaitsxml.dao.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryAllUsers();
    public User queryByAge(Integer age);
    public void inserUser(User user);

    public  void  deleteUser(Integer id);

    public  void  updateUserById(User user);


}
