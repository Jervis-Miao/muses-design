/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.design.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.muses.design.component.strategy.IStrategy;
import cn.muses.design.component.strategy.StrategyAnnotationImpl;
import cn.muses.design.component.strategy.StrategyManager;

/**
 * @author miaoqiang
 * @date 2020/6/24.
 */
@Service
public class StrategyService {

    @Autowired
    private StrategyManager strategyManager;

    public String get(String strategy) {
        IStrategy iStrategy;
        if (null == (iStrategy = strategyManager.get(new StrategyAnnotationImpl(strategy)))) {
            return String.format("未找到[%s]所对应的策略", strategy);
        }
        return String.format("策略[%s]的执行结果为: %s", strategy, iStrategy.doHandle(strategy));
    }
}
