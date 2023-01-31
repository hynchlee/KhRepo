package com.kh.member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MemberManager {

	private final String path = "D:\\dev\\member.txt";

	// 회원가입
	// 전달받은 데이터를 메모장에 저장
	public void join(String id, String pwd, String nick) throws Exception {

		// 유효성 검사
		if (id.contains(",") || pwd.contains(",")) {
			// 예외 발생
			throw new Exception("회원가입 실패 (,는 입력할 수 없습니다.)");
		}

		// 메모장 파일 객체로 준비
		File f = new File(path);

		// stream 통로 얻기
		FileWriter fw = new FileWriter(f, true); // 회원가입 할때마다 정보 저장

		// 데이터 보내기
		fw.write(id + "," + pwd + "," + nick + "\n");
		fw.flush();

	}

	// 로그인
	// 메모장의 아이디 비번 읽기, 입력받은거랑 비교
	public void login(String id, String pwd) throws Exception {

		// 파일 객체 준비
		File f = new File(path);

		// 통로 준비
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		List<MemberData> list = new ArrayList<MemberData>();

		while (true) {
			// 데이터 읽기
			String str = br.readLine();

			if (str == null) {
				break;
			}

			// 객체로 변환
			String memoId = str.substring(0, str.indexOf(","));// indexOf(",") = 첫번째 , 가 있는곳
			String memoPwd = str.substring(str.indexOf(",") + 1, str.lastIndexOf(","));
			String memoNick = str.substring(str.lastIndexOf(",") + 1);
			// 첫번째 , 부터 마지막 , 까지 구하는 함수

			MemberData x = new MemberData(memoId, memoPwd, memoNick);

			list.add(x);
		}

		for (int i = 0; i < list.size(); i++) {
			MemberData temp = list.get(i);

			if (temp.getMemberId().equals(id) && temp.getMemberPwd().equals(pwd)) {// 아이디 일치
				return;
			}

		}

		throw new Exception("로그인 실패");

	}

}
