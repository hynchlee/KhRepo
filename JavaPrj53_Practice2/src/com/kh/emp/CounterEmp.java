package com.kh.emp;

import java.util.Scanner;

import com.kh.menu.Menu;

public class CounterEmp {

	private String name;

	// 주문(메뉴 보여주기, 주문 받기)
	public int takeOrder() {
		System.out.println("주문하시겠습니까?");
		System.out.println("=========메뉴=========");
		System.out.println("1." + Menu.ONE);
		System.out.println("2." + Menu.TWO);
		System.out.println("3." + Menu.THREE);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주문하실 메뉴를 선택해주세요 : ");
		String menuNum_ = sc.nextLine();
		int menuNum = Integer.parseInt(menuNum_.trim());
		
		return menuNum;
	}

	public void calc() {
		System.out.println("계산~");
	}

}
