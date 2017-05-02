package com.study.java.basic.thread;

/**
 * @author SuJi, Lee
 *
 */
public class ThreadStateMain {
	public static void main(String[] args) {
		//		checkThreadState1();
		infinite();

	}

	private static void checkThreadState1() {
		SleepThread s = new SleepThread(2000);
		System.out.println("thread state=" + s.getState()); // 시작전 NEW
		s.start();
		System.out.println("thread state(after start)=" + s.getState()); // RUNNING

		try {
			Thread.sleep(1000); // 1초후에 호출
			System.out.println("thread state(after sleep)=" + s.getState()); // 2초간 잠자는 모드 TIMED ㄴWAITING

			s.join();
			//s.join(500); // ERROR 발생. 총 1.5 초 기다린 것으로 thread가 아직 종료되지 않아 강제 interrupt
			//s.join(1300); // 2초 이상 대기하여 에러 안남
			s.interrupt();
			System.out.println("thread state(after join)=" + s.getState()); // TERMINATED

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void infinite() {
		InfiniteThread i = new InfiniteThread();
		i.start();
		try {
			Thread.sleep(500); //다른 thread임
			//i.sleep(500);
			i.interrupted(); // wait(), join(), sleep() 호출 하지 않았으므로 중단 안됨.
			System.out.println("interrupted call" + i.getState()); // 계속 돌아가고 있으므로, RUNNABLE
			i.join(500);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("isAlive =" + i.isAlive()); // true (무한)
		System.out.println("isInterrupted =" + i.isInterrupted()); // false (중지 안됨)
	}

}
