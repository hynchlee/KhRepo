package com.kh.main;

public class Main {

	public static void main(String[] args) {

		System.out.println("======= list =======");

		int[] arr = new int[3];
		
		KhList list = new KhList();
		
		list.add(100);
		list.add(100);
		list.add(100);
				
		int temp = list.get(0);
		System.out.println(temp);
		
		
		
	}

}
