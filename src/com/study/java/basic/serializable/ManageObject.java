package com.study.java.basic.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author SuJi, Lee
 *
 */
public class ManageObject {
	public static void main(String[] args) {
		ManageObject manager = new ManageObject();
		String fullPath = "C:\\basicjava" + File.separator + "serial.obj";
		SerialDTO object = new SerialDTO("javaBasic", 1, true, 100);
		manager.saveObject(fullPath, object);
		manager.readObject(fullPath);
	}

	private void saveObject(String fullPath, SerialDTO object) {
		FileOutputStream fo = null;
		ObjectOutputStream o = null;
		try {
			fo = new FileOutputStream(fullPath);
			o = new ObjectOutputStream(fo);
			o.writeObject(object);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (o != null) {
				try {
					o.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fo != null) {
				try {
					fo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void readObject(String fullPath) {
		FileInputStream fi = null;
		ObjectInputStream oi = null;

		try {
			fi = new FileInputStream(fullPath);
			oi = new ObjectInputStream(fi);
			Object o = (SerialDTO)oi.readObject();
			System.out.println(o.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (oi != null) {
				try {
					oi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fi != null) {
				try {
					fi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
