package com.study.java.basic.string;

/**
 * @author SuJi, Lee
 *
 */
public class MyString {
	public void printWords(String str) {
		if (str == null) {
			return;
		}
		String[] datas = str.split(" ");
		for (String data : datas) {
			System.out.println(data);
		}
	}

	public void findString(String str, String findStr) {
		if (str == null | findStr == null) {
			return;
		}

		print(findStr, str.indexOf(findStr));
	}

	public void findAnyCaseString(String str, String findStr) {
		if (str == null | findStr == null) {
			return;
		}
		print(findStr, str.toLowerCase().indexOf(findStr));
	}

	private void print(String findStr, int index) {
		if (index != -1) {
			System.out.println(findStr + " is appeared at " + index);
		} else {
			System.out.println("not exists");
		}
	}

	public void countChar(String str, char c) {
		if (str == null) {
			return;
		}

		int count = 0;
		char[] datas = str.toCharArray();
		for (char data : datas) {
			if (data == c) {
				count++;
			}
		}

		System.out.println("char '" + c + "' count is " + count);
	}

	public void printContainsWord(String str, String findStr) {
		if (str == null) {
			return;
		}

		if (str.contains(findStr)) {
			System.out.println("class contains " + findStr);
		} else {
			System.out.println("not exists");
		}
	}

	public static void main(String[] args) {
		MyString myString = new MyString();
		String test1 = "The String class represents character strings.";
		myString.printWords(test1);
		myString.findString(test1, "string");
		myString.findAnyCaseString(test1, "string");
		myString.countChar(test1, 's');
		myString.printContainsWord(test1, "ss");
	}

}
