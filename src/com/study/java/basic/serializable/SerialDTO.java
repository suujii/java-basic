package com.study.java.basic.serializable;

import java.io.Serializable;

/**
 * @author SuJi, Lee
 *
 */
public class SerialDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String bookName;
	private int bookOrder;
	private boolean bestSeller;
	private transient long soldPerDay;
	private String bookType = "IT";

	public SerialDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {
		super();
		this.bookName = bookName;
		this.bookOrder = bookOrder;
		this.bestSeller = bestSeller;
		this.soldPerDay = soldPerDay;
	}

	@Override
	public String toString() {
		return "SerialDTO [bookName=" + bookName + ", bookOrder=" + bookOrder + ", bestSeller=" + bestSeller + ", soldPerDay=" + soldPerDay + ", bookType=" + bookType + "]";
	}
}
