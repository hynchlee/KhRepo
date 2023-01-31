package com.kh.main;

import com.kh.car.Avante;
import com.kh.car.Car;
import com.kh.car.Sonata;

public class Main {

	public static void main(String[] args) {

		System.out.println("=====자동차=====");

		Car[] arr = new Car[2];
		arr[0] = new Avante();
		arr[1] = new Sonata();

		for (int i = 0; i < arr.length; i++) {
			arr[i].toString();
		}

	}

}
