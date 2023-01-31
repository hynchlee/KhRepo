package com.kh.main;

public class KhList {

	private int[] arr = new int[3];
	private int empty = 0;

	public int get(int n) {
		return arr[n];
	}

	public void add(int value) {

		increaseArr();
		
		arr[empty] = value;
		empty++;

	}

	// 배열 사이즈 증가, 기존 배열의 값을 복사

	private void increaseArr() {	
		
		if (empty == arr.length) {
			int[] tempArr = new int[arr.length * 2];	//기존 배열의 2배 증가

			for (int i = 0; i < arr.length; i++) {
				tempArr[i] = arr[i];

			}
			arr = tempArr;
		}
		
	}

}
