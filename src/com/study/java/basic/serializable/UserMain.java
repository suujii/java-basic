package com.study.java.basic.serializable;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class UserMain {
	private static final String USER = "serialize_user";

	public static void main(String[] args) {
		serializing();
		deSerializing();

	}

	private static void serializing() {
		try {
			FileOutputStream fos = new FileOutputStream(USER);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);

			User user1 = new User("이수지", "1234", "suji.lee@nhn.com", 27, new UserInfo(10));
			List<User> list = new ArrayList<User>();
			list.add(user1);

			out.writeObject(user1);
			out.writeObject(list);
			System.out.println("완료!");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void deSerializing() {
		try {
			FileInputStream fis = new FileInputStream(USER);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);

			User user1 = (User)in.readObject();
			ArrayList<User> list = (ArrayList<User>)in.readObject();

			System.out.println(user1.toString());
			System.out.println(list.toString());

			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
