/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.design.component.strategy.impl;

import cn.muses.design.component.strategy.IStrategy;
import cn.muses.design.component.strategy.StrategyAnnotation;

/**
 * @author miaoqiang
 * @date 2020/6/24.
 */
@StrategyAnnotation(strategy = "bbb")
public class BbbStrategy implements IStrategy {

    @Override
    public <T, P> T doHandle(P p) {
        return (T) "bbb";
    }
}
