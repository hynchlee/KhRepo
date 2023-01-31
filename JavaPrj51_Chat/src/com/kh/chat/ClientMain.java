package com.kh.chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) throws Exception {

		System.out.println("=======클라이언트=======");

		Socket s = new Socket("200.200.200.25", 12345);

		System.out.println("연결완료 !" + s);

		InputStream is = s.getInputStream(); // 통로 생성
		InputStreamReader isr = new InputStreamReader(is); // 리더 생성
		BufferedReader br = new BufferedReader(isr); // 파라미터 리더만

		// 데이터 읽기
		while (true) {
			String msg = br.readLine();
			System.out.println(msg);
		}

	}

}
