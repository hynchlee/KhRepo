package com.kh.main;

public class Main {

	public static void main(String[] args) {

		System.out.println("======배열======");

		// 배열은 같은 타입 한번에 관리
		// 배열 생성 : new 타입[몇칸]; //배열은 == 객체

		// 10개의 정수타입 변수 관리할 필요가 생김
		int[] arr/*주소값을 가지고 있다.*/ = new int[10];

		// 변수 사용 가능 == 변수에 접근 가능 == set, read 가능
		// 배열의 특정칸에 접근 가능 == 배열 사용 가능
		arr[0] = 123;
		int temp = arr[0];
		System.out.println(temp);

	}

}
