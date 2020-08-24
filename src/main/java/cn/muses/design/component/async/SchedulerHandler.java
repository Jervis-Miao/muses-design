/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.design.component.async;

import org.springframework.scheduling.annotation.Async;

/**
 * @author miaoqiang
 * @date 2020/8/21.
 */
public interface SchedulerHandler {

    @Async
    default void handle() {}
}
