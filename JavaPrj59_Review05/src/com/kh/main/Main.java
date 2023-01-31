package com.kh.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=======컬렉션과 제네릭=======");
		
		//컬렉션 : 자료구조 모음집
		//자료구조 : 자료들 잘 담으려고 만든 구조물
		//종류 = list, set, map, stack, queue
		
		//list가 상위 타입이라 문제 없다.
		//Integer타입의 데이터만 담을 수 있다.
		List<Integer> x = new ArrayList<Integer>();
		
		
		//add(데이터를 추가한다. 빈칸부터)
		x.add(333);	//0번째 배열에 333을 추가
		
		//get
		Integer temp = x.get(0);
		System.out.println(temp);
		
		//remove
		x.remove(0);
		System.out.println(x.get(0));
		
		MyVar<String> v = new MyVar<String>();
		v.setX("ddfadf");
		String result = v.getX();
		
		
		
		
		
		
	}
	
}
