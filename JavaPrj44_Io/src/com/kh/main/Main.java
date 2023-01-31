package com.kh.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("=====입출력=====");
		
		File f = new File("abc.txt");
		
		try {
			FileWriter fw = new FileWriter(f);
			fw.write(a = sc.next());
			fw.flush();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		
		
	}

}
