package com.kh.manager;

import com.kh.mob.Pokemon;

public class BattleManager {
	
	public void battleStart(Pokemon user, Pokemon enemy) {
		
		boolean isFinish = true;
		
		while(true) {
		isFinish = fight(user, enemy);
		if(isFinish) {break;}
		isFinish = fight(enemy, user);
		if(isFinish) {break;}
		}
	}
	
	public boolean fight(Pokemon attacker, Pokemon deffender) {
		
		attacker.bodyAttack();
		int damage = attacker.getAtk() - deffender.getDef();
		deffender.setHp(deffender.getHp() - damage);
		if(deffender.getHp() <= 0) {
			System.out.println(attacker.getName() + "의 승리!");
			return true;
		}else {
			return false;
		}
		
	}

}
