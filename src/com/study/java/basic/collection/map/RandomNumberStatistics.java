package com.study.java.basic.collection.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

/**
 * @author SuJi, Lee
 * 1~50까지 숫자중 5000번 수행하였을 때, 각 숫자별로 몇번 나왔는지 확인.
 */
public class RandomNumberStatistics {
	private static final int DATA_BOUNDARY = 50;
	private Map<Integer, Integer> hashtable;

	public RandomNumberStatistics() {
		hashtable = new Hashtable<Integer, Integer>();
	}

	public void getRandomNumberStatistics() {
		for (int i = 1; i <= 5000; i++) {
			Random r = new Random();
			int data = r.nextInt(DATA_BOUNDARY) + 1; //random() 1<=value<51
			putCurrentNumber(data);
		}

		printStatistics();
	}

	private void putCurrentNumber(int data) {
		if (hashtable.containsKey(data) == false) {
			hashtable.put(data, 1);
		} else {
			hashtable.put(data, hashtable.get(data) + 1);
		}
	}

	public void printStatistics() {
		//1.
		Set<Integer> keySet = hashtable.keySet();
		for (Integer key : keySet) {
			System.out.print(key + "=" + hashtable.get(key) + " ");

			if (key % 10 - 1 == 0) {
				System.out.println();
			}
		}

		//2.
		Set<Entry<Integer, Integer>> entrySet = hashtable.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.print(entry.getKey() + "=" + entry.getValue() + " ");

			if (entry.getKey() % 10 - 1 == 0) {
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		RandomNumberStatistics s = new RandomNumberStatistics();
		s.getRandomNumberStatistics();
	}

}
