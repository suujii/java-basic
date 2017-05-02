package com.study.basic.file.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author SuJi, Lee
 * Writer 이용
 */
public class MangageTextFile {
	public static void main(String[] args) {
		MangageTextFile manage = new MangageTextFile();
		int numberCount = 10;

		String directoryPath = "C:\\basicjava";
		File directory = new File(directoryPath);

		if (directory.exists() == false) {
			directory.mkdirs();
		}

		File file = new File(directoryPath, "number.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String fullPath = "C:\\basicjava" + File.separator + "number.txt";
		manage.writeFile(fullPath, numberCount);
		manage.readFile(fullPath);
		manage.readLineScanner(fullPath);
		manage.readLineScanner2(fullPath);

	}

	private void writeFile(String fullPath, int numberCount) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(fullPath);
			bw = new BufferedWriter(fw);

			for (int i = 0; i < numberCount; i++) {
				bw.write(Integer.toString(i));
				bw.newLine();
			}
			System.out.println("success");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private void readFile(String fullPath) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fullPath);
			br = new BufferedReader(fr);
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private void readLineScanner(String fullPath) {
		File file = new File(fullPath);
		Scanner s = null;
		try {
			s = new Scanner(file);

			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (s != null) {
				s.close();
			}
		}

	}

	private void readLineScanner2(String fullPath) { // path만 읽게됨
		Scanner s = new Scanner(fullPath);

		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		if (s != null) {
			s.close();
		}
	}
}
