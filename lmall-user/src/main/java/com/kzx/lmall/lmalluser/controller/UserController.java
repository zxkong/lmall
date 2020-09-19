package com.kzx.lmall.lmalluser.controller;

import com.kzx.lmall.bean.UserInfo;
import com.kzx.lmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: .
 * Created by kzx on 9/14/20.
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/allusers")
    public List<UserInfo> getAllUsers() {
        return userService.getUserInfoListAll();
    }

    @GetMapping("/getuser")
    public UserInfo getUser(String id) {
        return userService.getUserInfoById(id);
    }


    @PostMapping("/adduser")
    public String addUser(UserInfo userInfo) {
        userService.addUser(userInfo);
        return "success";
    }

    @PutMapping("/updateUser")
    public String updateUser(UserInfo userInfo) {
        userService.updateUser(userInfo);
        return "success";
    }

    @PutMapping("/updateUserByName")
    public String updateUserByName(UserInfo userInfo) {
        userService.updateUserByName(userInfo.getName(), userInfo);
        return "success";
    }

    @PostMapping("/deleteuser")
    public String deleteUser(UserInfo userInfo) {
        userService.delUser(userInfo);
        return "success";
    }

}
