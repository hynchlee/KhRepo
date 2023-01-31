package com.kh.main;

public class Main {
	
	public static void main(String[] args) throws Exception {
	
		System.out.println("========예외========");
		
		Test t = new Test();
		
		try {
			t.login("user01", "1");			
		} catch (Exception e) {
//			String msg = e.getMessage();
//			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
