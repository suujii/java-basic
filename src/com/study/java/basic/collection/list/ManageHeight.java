package com.study.java.basic.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 * list를 이용하여 반별 키 합, 평균 구하기
 */
public class ManageHeight {
	private List<List<Integer>> gradeHeight = new ArrayList<List<Integer>>();

	public void setData() {
		List<Integer> list1 = new ArrayList<Integer>(5);
		list1.add(170);
		list1.add(180);
		list1.add(173);
		list1.add(175);
		list1.add(177);

		List<Integer> list2 = new ArrayList<Integer>(4);
		list2.add(160);
		list2.add(165);
		list2.add(167);
		list2.add(186);

		List<Integer> list3 = new ArrayList<Integer>(4);
		list3.add(158);
		list3.add(177);
		list3.add(187);
		list3.add(176);

		List<Integer> list4 = new ArrayList<Integer>(4);
		list4.add(173);
		list4.add(182);
		list4.add(181);

		List<Integer> list5 = new ArrayList<Integer>(3);
		list5.add(170);
		list5.add(180);
		list5.add(165);
		list5.add(177);
		list5.add(172);

		gradeHeight.add(list1);
		gradeHeight.add(list2);
		gradeHeight.add(list3);
		gradeHeight.add(list4);
		gradeHeight.add(list5);
	}

	public void printHeight(int classNo) {
		if (classNo < 0 || classNo > gradeHeight.size()) {
			return;
		}

		System.out.println("Class NO.:" + classNo);

		List<Integer> heights = gradeHeight.get(classNo - 1);
		for (Integer height : heights) {
			System.out.println(height);
		}

		System.out.println("=========");
	}

	public void printAverage(int classNo) {
		if (classNo < 0 || classNo > gradeHeight.size()) {
			return;
		}

		System.out.println("Class NO.:" + classNo);

		int sum = 0;
		double average = 0;
		List<Integer> heights = gradeHeight.get(classNo - 1);

		for (Integer height : heights) {
			sum += height;
		}

		average = sum / heights.size();
		System.out.println("Height average:" + average);
		System.out.println("=========");
	}

	public static void main(String[] args) {
		ManageHeight h = new ManageHeight();
		h.setData();
		for (int classNo = 1; classNo <= 5; classNo++) {
			h.printHeight(classNo);
			h.printAverage(classNo);
		}
	}
}
