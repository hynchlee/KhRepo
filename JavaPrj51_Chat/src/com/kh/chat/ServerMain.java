package com.kh.chat;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) throws Exception {

		System.out.println("=======서버========");

		ServerSocket ss = new ServerSocket(12345);

		System.out.println("연결 대기중....");
		Socket s = ss.accept();
		System.out.println("연결 완료 : " + s);

		// 아웃풋 스트림 생성(통로 생성)
		OutputStream out = s.getOutputStream();
		PrintWriter pw = new PrintWriter(out); // 통로 확장
//		BufferedWriter bw = new BufferedWriter(pw);

		// 메세지 보내기
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("보낼 메세지 : ");
			String msg = sc.nextLine();
			
			//종료 조건
			if(msg.equals("exit")) {
				break;
			}
			
			pw.println(msg);
			pw.flush();
		}

	}

}
