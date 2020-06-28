/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.design.component.strategy;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author miaoqiang
 * @date 2020/6/24.
 */
public class StrategyAnnotationImpl extends AbstractStrategyAnnotation implements StrategyAnnotation {

    private String strategy;

    public StrategyAnnotationImpl(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public String strategy() {
        return this.strategy;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return StrategyAnnotation.class;
    }

}
