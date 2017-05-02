package com.study.java.basic.thread;

/**
 * @author SuJi, Lee
 * thread 상태값 알아보기
 */
public class SleepThread extends Thread {
	private long sleepTime;

	public SleepThread(long sleepTime) {
		this.sleepTime = sleepTime;
	}

	public void run() {
		try {
			System.out.println("sleeping " + getName());
			Thread.sleep(sleepTime);
			System.out.println("stoping " + getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
