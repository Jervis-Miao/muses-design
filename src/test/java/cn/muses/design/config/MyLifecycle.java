/**
 * Copyright 2022 All rights reserved.
 */

package cn.muses.design.config;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @author jervis
 * @date 2022/8/1.
 */
@Component
public class MyLifecycle implements SmartLifecycle {
	private boolean isRunning = false;

	@Override
	public void start() {
		System.out.println("启动");
		isRunning = true;
	}

	@Override
	public void stop() {
		// 要触发stop()，要调用context.close()，或者注册关闭钩子（context.registerShutdownHook();）
		System.out.println("停止");
		isRunning = false;
	}

	@Override
	public boolean isRunning() {
		return isRunning;
	}
}
