package com.study.java.basic.thread;

/**
 * @author SuJi, Lee
 *
 */
public class VolatileSample extends Thread {
	//	private volatile double instanceValue = 0;//선언 시, cpu 캐시 업데이트 
	private double instanceValue = 0;

	public void set(double value) {
		this.instanceValue = value;
	}

	public void run() {
		while (instanceValue == 0) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(instanceValue);
		}
	}
}
