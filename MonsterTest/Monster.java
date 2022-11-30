package com.lemon.monster_game;

public class Monster {
String name; 

public Monster () {
	name = ""; 
}

public Monster(String aMonster) {
	name = aMonster; 
}

public String getMonster() {
	return name; 
}
public void setMonster(String aMonster) {
	name = aMonster; 
}

public String attack() {
	return ("Attack with..."); 
	
}

public String attack(String garbage) {
	return ("I don't know how to attack!"); 
}
}