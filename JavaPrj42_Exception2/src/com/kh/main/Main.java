package com.kh.main;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("========예외=========");
		
		MemberController mc = new MemberController();
//		boolean result = mc.join("이현철", "1234", "chul1");
//		System.out.println("회원가입 결과 : " + result);
		
		try {
			mc.join2("이현철", "1", "chul1");
		} catch (Exception e) {
			System.out.println("회원가입 실패");
			System.out.println(e.getMessage());
		}
		
	}

}
