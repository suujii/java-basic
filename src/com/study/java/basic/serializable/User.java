/**
 * 직렬화 관련
 */
package com.study.java.basic.serializable;

import java.io.Serializable;

/**
 * @author SuJi, Lee
 *
 */
public class User implements Serializable {
	private static final long serialVersionUID = -2895397441541100404L;

	private String name;
	private transient String password;
	private String email;
	private int age;
	private UserInfo data;

	public User(String name, String password, String email, int age, UserInfo data) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.age = age;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UserInfo getData() {
		return data;
	}

	public void setData(UserInfo data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + ", age=" + age + ", data=" + data + "]";
	}
}
