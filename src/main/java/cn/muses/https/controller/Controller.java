/*
Copyright 2019 All rights reserved.
 */

package cn.muses.https.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jervis
 * @date 2020/6/7.
 */
@RestController
@RequestMapping("/test")
public class Controller {

    @RequestMapping("/a")
    public Object test() {
        return "test";
    }
}
