package com.kh.main;

import com.kh.car.Avante;
import com.kh.car.Car;
import com.kh.car.Sonata;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("=======인터페이스=======");
		
		Sonata s = new Sonata();
		s.go();
		s.stop();
		
		if (s instanceof Car) {
			System.out.println("s에 연결된 객체는 소나타 맞음");			
			
		}
		
		Avante a = new Avante();
		a.go();
		a.stop();
	}

}