package com.example.mybaitsxml.controller;

import com.example.mybaitsxml.dao.entity.User;
import com.example.mybaitsxml.service.UserService;
import com.example.mybaitsxml.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/web")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/queryAllUsers")
    public Result queryAllUsers(){
        return  Result.success(userService.queryAllUsers());
    }

    @GetMapping("/queryByAge/{age}")
    public Result queryByAge(@PathVariable("age") Integer age){
        return  Result.success(userService.queryByAge(age));
    }

    @PostMapping("/saveUser")
    public Result saveUser(@RequestBody User user){
        userService.inserUser(user);
        return Result.success("插入成功");
    }
    @PostMapping("/deleteUser")
    public Result deleteUser(@RequestBody User user){
        userService.deleteUser(user.getId());
        return Result.success("删除成功");
    }

    @PostMapping("/updateUser")
    public Result updateUser(@RequestBody User user){
        userService.updateUserById(user);
        return Result.success("修改成功");
    }
}
