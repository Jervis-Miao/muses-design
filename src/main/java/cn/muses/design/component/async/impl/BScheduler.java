/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.design.component.async.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import cn.muses.design.component.async.SchedulerHandler;

/**
 * @author miaoqiang
 * @date 2020/8/21.
 */
@Component
public class BScheduler implements SchedulerHandler {

    @Override
    public void handle() {
        System.out.println(Thread.currentThread().getName() + ", " + Thread.currentThread().getId());
    }
}
