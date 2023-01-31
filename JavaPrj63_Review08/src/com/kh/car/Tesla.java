package com.kh.car;

public class Tesla extends Car implements ElectronicCar{

	public int price;
	
	@Override
	public void go() {
		System.out.println("전기의 힘으로 감");
	}
	
	@Override
	public void stop() {
		System.out.println("전기 차단");
	}

	@Override
	public void escape() {
		
		
	}
	
	
}
