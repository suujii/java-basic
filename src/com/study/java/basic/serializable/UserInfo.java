/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.study.java.basic.serializable;

import java.io.Serializable;

/**
 * @author SuJi, Lee
 *
 */
public class UserInfo implements Serializable { //serializable 없으면 error 발생
	private int data;

	public UserInfo(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "UserInfo [data=" + data + "]";
	}
}
