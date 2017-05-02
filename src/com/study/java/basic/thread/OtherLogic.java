package com.study.java.basic.thread;

/**
 * @author SuJi, Lee
 *
 */
public class OtherLogic {
	public void printMyNumber() {
		System.out.println(Thread.currentThread().getName() + " OtherLogic value" + ThreadLocalSample.get());
	}

}
