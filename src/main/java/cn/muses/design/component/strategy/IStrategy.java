/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.design.component.strategy;

/**
 * @author miaoqiang
 * @date 2020/6/24.
 */
public interface IStrategy {

    /**
     * 业务处理
     *
     * @param p
     * @param <T>
     * @param <P>
     * @return
     */
    public <T, P> T doHandle(P p);
}
