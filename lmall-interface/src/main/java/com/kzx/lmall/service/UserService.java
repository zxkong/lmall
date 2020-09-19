package com.kzx.lmall.service;

import com.kzx.lmall.bean.UserInfo;

import java.util.List;

/**
 * Description: .
 * Created by kzx on 9/14/20.
 */

public interface UserService {

    List<UserInfo> getUserInfoListAll();

    UserInfo getUserInfoById(String id);

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(UserInfo userInfo);

}
