/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.https.component.strategy;

import java.lang.annotation.*;

import org.springframework.stereotype.Component;

/**
 * @author miaoqiang
 * @date 2020/6/24.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface StrategyAnnotation {

    String strategy() default "";
}
