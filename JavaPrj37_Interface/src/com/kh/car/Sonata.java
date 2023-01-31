package com.kh.car;

public class Sonata implements Car, Car2{

	@Override
	public void go() {
		System.out.println("화석연료 이용해서 ㄱ");
	}

	@Override
	public void stop() {
		System.out.println("휘발유차 정지");
	}	
	
	
}
