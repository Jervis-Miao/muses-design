/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.https.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.muses.https.service.StrategyService;

/**
 * @author jervis
 * @date 2020/6/7.
 */
@RestController
@RequestMapping("/strategy")
public class StrategyController {

    @Autowired
    private StrategyService strategyService;

    @RequestMapping("/get")
    public Object get(@RequestParam String strategy) {
        return strategyService.get(strategy);
    }
}
