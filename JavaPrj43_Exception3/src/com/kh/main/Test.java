package com.kh.main;

public class Test {

	public void login(String id, String pwd) throws Exception {

		System.out.println("m01 호출됨");

		if (id.length() < 2 || pwd.length() < 2) {
//			throw new Exception("로그인 실패(값이 너무 짧음)");
			throw new LoginFailException("로그인 실패");
		}

		System.out.println("로그인 성공");
		System.out.println("m01 종료됨");

	}

}
