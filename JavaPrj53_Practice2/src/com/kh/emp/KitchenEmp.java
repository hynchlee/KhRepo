package com.kh.emp;

import com.kh.menu.Menu;

public class KitchenEmp {

	// 요리하기
	public String cook(int menuNum) throws Exception {

		String menu = Menu.convertMenu(menuNum);

		return menu;
	}

}
