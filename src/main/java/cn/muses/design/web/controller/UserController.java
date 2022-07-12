/**
 * Copyright 2022 XYZ Co., Ltd. All Rights Reserved
 */
package cn.muses.design.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.muses.design.web.vo.UserVO;
import cn.muses.utils.json.JsonMapper;

/**
 * @author jervis
 * @date 2022/7/12.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private JsonMapper jsonMapper;

    @GetMapping("get")
    public UserVO get() {
        UserVO user = new UserVO("test", "13111111111", "test1111");
        String userStr = jsonMapper.toJson(user);
        return jsonMapper.fromJson(userStr, UserVO.class);
    }
}
