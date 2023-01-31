package com.kh.main;

import com.kh.mob.Ddodogas;
import com.kh.mob.Gugu;
import com.kh.mob.Pairi;
import com.kh.mob.Pikachu;
import com.kh.mob.Poketmon;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("========포켓몬========");
		
		//포켓몬 객체 배열 만들기
		Poketmon[] mobArr = new Poketmon[4];
		//만들어진 포켓몬 객체 배열에 피츄 객체 집어넣기
		mobArr[0] = new Pikachu();
		mobArr[1] = new Pairi();
		mobArr[2] = new Ddodogas();
		mobArr[3] = new Gugu();
		
		//
		for(int i = 0; i<mobArr.length; i++) {
			mobArr[i].bodyAttack();
			mobArr[i].skill();
		}
		
//		for(Poketmon x : mobArr) {
//			x.bodyAttack();
//		}
		
//		mob01.skill01();
//		mob02.skill01();
//		mob03.skill01();
	}
	
}