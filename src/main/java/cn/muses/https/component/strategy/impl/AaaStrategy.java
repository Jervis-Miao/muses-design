/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.https.component.strategy.impl;

import cn.muses.https.component.strategy.IStrategy;
import cn.muses.https.component.strategy.StrategyAnnotation;

/**
 * @author miaoqiang
 * @date 2020/6/24.
 */
@StrategyAnnotation(strategy = "aaa")
public class AaaStrategy implements IStrategy {

    @Override
    public <T, P> T doHandle(P p) {
        return (T) p;
    }
}
