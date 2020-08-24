/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.design.config.async;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.muses.design.config.JunitTest;

import cn.muses.design.component.async.SchedulerHandler;

/**
 * @author miaoqiang
 * @date 2020/8/21.
 */
public class AsyncTest extends JunitTest {

    @Autowired
    private List<SchedulerHandler> handlers;

    @Test
    public void test() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ", " + Thread.currentThread().getId());
        Thread.sleep(100);
        System.out.println("-------------------------------------------");
        for (SchedulerHandler handler : handlers) {
            Thread.sleep(100);
            handler.handle();
        }
        Thread.sleep(1000);
    }
}
