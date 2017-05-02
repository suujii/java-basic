package com.study.java.basic.thread;

import java.util.HashMap;

/**
 * @author SuJi, Lee
 *
 */
public class InfiniteThread extends Thread {
	public void run() {
		while (true) {
			String str = "String.";
			new HashMap(10000);
			new HashMap(10000);

			//			if (Thread.interrupted()) {
			//				return;
			//			}
		}
	}

}
