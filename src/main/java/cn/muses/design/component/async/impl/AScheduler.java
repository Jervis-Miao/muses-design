/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.design.component.async.impl;

import cn.muses.design.component.async.SchedulerHandler;
import org.springframework.stereotype.Component;

/**
 * @author miaoqiang
 * @date 2020/8/21.
 */
@Component
public class AScheduler implements SchedulerHandler {

    @Override
    public void handle() {
        System.out.println(Thread.currentThread().getName() + ", " + Thread.currentThread().getId());
    }
}
