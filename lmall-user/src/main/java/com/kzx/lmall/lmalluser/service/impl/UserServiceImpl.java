package com.kzx.lmall.lmalluser.service.impl;

import com.kzx.lmall.bean.UserInfo;
import com.kzx.lmall.lmalluser.mapper.UserMapper;
import com.kzx.lmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Description: .
 * Created by kzx on 9/14/20.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserInfo> getUserInfoListAll() {
        List<UserInfo> userInfoList = userMapper.selectAll();
        return userInfoList;
    }

    @Override
    public UserInfo getUserInfoById(String id) {
        UserInfo userInfo = userMapper.selectByPrimaryKey(id);
        return userInfo;
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userMapper.insertSelective(userInfo);
        // insertSelective: only update fields that not null

    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userMapper.updateByPrimaryKeySelective(userInfo);

    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name", name);
        userMapper.updateByExampleSelective(userInfo, example);
    }

    @Override
    public void delUser(UserInfo userInfo) {
        userMapper.deleteByPrimaryKey(userInfo.getId());
    }
}
