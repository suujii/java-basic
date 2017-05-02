package com.study.java.basic.thread;

/**
 * @author SuJi, Lee
 *
 */
public class RunSync {

	public static void main(String[] args) {
		CommonCalculate calc = new CommonCalculate();
		ModifyAmountThread t1 = new ModifyAmountThread(calc, true); // 다른 thread가 같은 객체의 instance변수를 조작
		ModifyAmountThread t2 = new ModifyAmountThread(calc, true);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
			System.out.println("Final value is " + calc.getAmount());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
