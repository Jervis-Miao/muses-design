/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.https.component.strategy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

/**
 * @author miaoqiang
 * @date 2020/6/24.
 */
@Service
public class StrategyManager {

    /**
     * 策略处理器
     */
    private Map<StrategyAnnotation, IStrategy> strategies;

    @Autowired
    public StrategyManager(List<IStrategy> strategies) {
        // 注入业务策略处理器
        this.strategies = strategies.stream().collect(Collectors.toMap(
            s -> AnnotationUtils.findAnnotation(s.getClass(), StrategyAnnotation.class), s -> s, (s1, s2) -> s1));
    }

    /**
     * 获取处理器
     *
     * @param annotation
     * @return
     */
    public IStrategy get(StrategyAnnotation annotation) {
        return this.strategies.get(annotation);
    }
}
