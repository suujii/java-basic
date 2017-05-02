package com.study.java.basic.thread;

/**
 * @author SuJi, Lee
 *
 */
public class LocalUserThread extends Thread {
	public void run() {
		int value = ThreadLocalSample.generateNumber();
		System.out.println(this.getName() + " LocalUserThread value" + value);

		OtherLogic otherLogic = new OtherLogic();
		otherLogic.printMyNumber();
		ThreadLocalSample.remove();
	}
}
