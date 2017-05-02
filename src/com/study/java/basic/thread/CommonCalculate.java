/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.study.java.basic.thread;

/**
 * @author SuJi, Lee
 *
 */
public class CommonCalculate {
	private int amount;
	Object lock1 = new Object(); // lock변수 공유 시 같이 느려지므로, 따로 가는 것이 좋음
	Object lock2 = new Object();

	public CommonCalculate() {
		amount = 0;
	}

	public void plus(int value) {
		synchronized (lock1) {
			amount += value;
		}
	}

	public void minus(int value) {
		synchronized (lock2) { //해당 부분만 locking 처리
			amount -= value;
		}
	}

	public int getAmount() {
		return amount;
	}
}
