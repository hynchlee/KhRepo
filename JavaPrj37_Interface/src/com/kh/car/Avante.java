package com.kh.car;

public class Avante implements Car{

	@Override
	public void go() {
		System.out.println("전기차 ㄱ");
	}

	@Override
	public void stop() {
		System.out.println("전기차 정지");
	}

	
}
