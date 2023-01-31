package com.kh.main;

import com.kh.manager.GameManager;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===========포케몬===========");
		
		GameManager gm = new GameManager();
		gm.generateMob();		
	}

}
