package com.kh.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String a = null;

		// 파일객체
		File f = new File("abc.txt");

		// 통로 생성
		FileOutputStream fos = new FileOutputStream(f);
		PrintWriter pw = new PrintWriter(fos); // 통로를 넓혀줌

		// 데이터 보내기
		for (int i = 0; i < 999; i++) {
			pw.println(a = sc.nextLine());
			
			if (a.equals("15963")) {
				break;
			}
			pw.flush(); // 만들어진 txt파일에 입력해주는 기능

		}

	}

}
