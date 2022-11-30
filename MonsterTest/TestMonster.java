package com.lemon.monster_game;

public class TestMonster {
	public static void main (String[] args) {
		Monster m1 = new FireMonster();
		Monster m2 = new WaterMonster();
		Monster m3 = new StoneMonster();
		
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
		
		Monster m4 = new Monster();
		System.out.println(m4.attack("garbage"));
	}
}
