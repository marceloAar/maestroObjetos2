//Marcelo Aceituno R
//Full Stack JAVA 0034
//Maestro de Objetos: Parte 2
package com.coding.maestrobjetos1;

public class Human {
	
	private int strength = 3;	
	private int stealth = 3; 	
	private int intelligence = 3;		
	private int health = 100;	
	
	public Human() {
		
	}
	
	public Human(int strength, int stealth, int intelligence, int health) {
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}

	public void attack() {
		int level = this.health -= 3;
		int atacante = this.strength +=3;
		System.out.println("Nivel de energia del jugador atacante: ** "+atacante);	
		System.out.println("Nivel de energia del jugador atacado: ** "+level);		
	}
	
	public void heal() {
		int level = this.intelligence -=3;
		System.out.println("Puntos de salud ..... "+level+" pts.");		
	}
	
	public void steal() {
		//Ninja: Agregar un método steal(Human) que roba la cantidad de puntos que tenga el Ninja 
		//en stealth de la salud del otro Human y los agrega a la health del Ninja.		
		
	}
	
	public void deathBlow() {
		//Samurai: Agregar un método deathBlow(Human) que asesina al otro Human y reduce la health del Samurai a la mitad.
		
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
