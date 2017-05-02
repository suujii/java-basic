package com.study.java.basic.thread;

/**
 * @author SuJi, Lee
 *
 */
public class ThreadLocalMain {
	public static void main(String[] args) {
		LocalUserThread[] threads = new LocalUserThread[3];
		for (LocalUserThread t : threads) {
			t = new LocalUserThread();
			t.start();
		}
	}
}
