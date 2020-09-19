package com.kzx.lmall.order.controller;

import com.kzx.lmall.bean.UserInfo;
import com.kzx.lmall.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: .
 * Created by kzx on 9/18/20.
 */

@RestController
public class OrderController {

    // 如果直接用@Autowired 会在lmall-order-web的container里找
    UserService userService;

    @GetMapping("trade")
    public UserInfo trade(String userId) {
        //
        UserInfo userInfo = userService.getUserInfoById(userId);
        return userInfo;
    }
}
