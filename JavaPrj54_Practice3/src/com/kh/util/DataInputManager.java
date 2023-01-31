package com.kh.util;

import java.util.Scanner;

public class DataInputManager {

	public static final Scanner SC = new Scanner(System.in);

	// 아이디 입력받기
	public String scanMemberId() {
		System.out.print("아이디 : ");
		return SC.nextLine().trim();
	}

	// 패스웓 입력받기
	public String scanMemberPwd() {
		System.out.print("비밀번호 : ");
		String p = SC.nextLine();
		return p.trim(); // trim() == 공백문자 추가 안됨
	}

	// 닉네임 입력받기
	public String scanMemberNick() {
		System.out.print("닉네임 : ");
		String n = SC.nextLine();
		return n.trim(); // trim() == 공백문자 추가 안됨
	}

}
