package com.kh.main;

import java.util.Scanner;

public class Main {

	public static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		FileManager fm = new FileManager();

		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");

		String num = SC.nextLine();
		if (num.equals("1")) {
			System.out.println("회원가입 하세요");
			fm.join();
		} else {
			fm.login();

		}

//		System.out.println("문자열을 입력하세여");
//		String msg = SC.nextLine();
//		fm.test01(msg);
//		
//		fm.test02();
	}

}
