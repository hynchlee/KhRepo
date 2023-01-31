package com.kh.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("~~~~~~ 제네릭 ~~~~~~~");
		
		ArrayList<String> companyList = new ArrayList<String>();
		
		String a = null;
		
		for (int i = 0; i < 3; i++) {
			a = sc.next();
			companyList.add(a);

		}
		for (int i = 0; i < 3; i++) {
			System.out.println(companyList.get(i));
		}
		

		
	}

}
