package com.kh.main;

import com.kh.mob.Poketmon;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("======= 객체배열 ========");
		
		Poketmon[] arr = new Poketmon[3];
		arr[0] = new Poketmon("피카츄", 100, 30);
		arr[1] = new Poketmon("라이츄", 120, 40);
		arr[2] = new Poketmon("파이리", 80, 40);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		
		//enhanced for문
		System.out.println("----------------------");
		for(Poketmon x : arr) {
			System.out.println(x);
		}
	}

}
