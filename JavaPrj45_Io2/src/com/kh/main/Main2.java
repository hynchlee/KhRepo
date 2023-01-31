package com.kh.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main2 {

	public static void main(String[] args) throws Exception {

		// 파일객체 생성
		File f = new File("abc.txt");

		// 통로 생성
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr); // 통로 확장

		// 데이터 읽기
		while (true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}

	}

}
