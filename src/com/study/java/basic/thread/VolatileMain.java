package com.study.java.basic.thread;

/**
 * @author SuJi, Lee
 *
 */
public class VolatileMain {
	public static void main(String[] args) {
		VolatileSample s = new VolatileSample();
		s.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sleep ended !!!");
		s.set(-1);
		System.out.println("Set Value is completed !!!");
	}

}
