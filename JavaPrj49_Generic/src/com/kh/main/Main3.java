package com.kh.main;

import java.util.HashMap;

public class Main3 {
	
	public static void main(String[] args) {
		
		System.out.println("제네릭");
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "심원용");
		map.put(222, "심투용");
		map.put(3333, "심삼용");
		
		System.out.println(map);
		
	}

}
