package com.kh.main;

import com.kh.member.MemberManager;
import com.kh.util.DataInputManager;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("=========회원가입=========");

		// 메뉴 보여주기
		System.out.println("1.회원가입");
		System.out.println("2.로그인");

		String menu = DataInputManager.SC.nextLine();

		MemberManager mm = new MemberManager();
		DataInputManager inputManager = new DataInputManager();

		if (menu.equals("1")) {
			String memberId = inputManager.scanMemberId();
			String memberPwd = inputManager.scanMemberPwd();
			String memberNick = inputManager.scanMemberNick();
			mm.join(memberId, memberPwd, memberNick);
			System.out.println("회원가입 완료");
		} else if (menu.equals("2")) {
			String memberId = inputManager.scanMemberId();
			String memberPwd = inputManager.scanMemberPwd();
			mm.login(memberId, memberPwd);
			System.out.println("로그인 성공");
		} else {
			System.out.println("잘못 선택함");
		}

	}

}
