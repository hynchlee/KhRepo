package com.kt.main;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public void count() {

		System.out.println("문자열");
		while(true) {
			System.out.println("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			if(str == "exit") {
				break;
			}else {
				System.out.println(str.length() + "글자입니다.");
			}
			
		}
		System.out.println("프로그램을 종료합니다");
	}

}
