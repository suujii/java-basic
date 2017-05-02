package com.study.java.basic.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author SuJi, Lee
 * Set의 성질을 이용하여, 임의의 숫자 6개 출력하기
 * 0~45
 */
public class RandomNumberMaker {
	private static final int MAX_COUNT = 6;

	public Set<Integer> getSixNumber() {
		Set<Integer> numbers = new HashSet<Integer>();

		while (numbers.size() != MAX_COUNT) {
			Random r = new Random();
			int number = r.nextInt(46); //random() 0<=value<46
			numbers.add(number);
		}

		return numbers;
	}

	public static void main(String[] args) {
		RandomNumberMaker r = new RandomNumberMaker();
		for (int i = 1; i <= 10; i++) {
			System.out.println(r.getSixNumber());
		}
	}
}
