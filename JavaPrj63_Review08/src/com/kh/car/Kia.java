package com.kh.car;

public class Kia extends Car{
	
	public int price;
	
	@Override
	public void go() {
		System.out.println("기름으로 감");
	}

	@Override
	public void stop() {
		System.out.println("기름 끊음");
	}
	
}
