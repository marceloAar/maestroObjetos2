//Marcelo Aceituno R
//Full Stack JAVA 0034
//Maestro de Objetos: Parte 2
package com.coding.maestrobjetos1;

public class Wizard extends Human{
//	**Wizard: Establecer un valor predeterminado de healt en 50.
//	**Wizard: Establecer un valor predeterminado de intelligence en 8.
//	Wizard: Agregar un método heal(Human) que aumentará la salud del otro Human en los puntos de intelligence que tenga el Wizard.
//	Wizard: Agregar un método fireBall(Human) que disminuye la salud del otro Human en los puntos de intelligence * 3 que tenga el Wizard.
	
	private int health = 50;
	private int intelligence = 8;	
	
	public void fireBall() {
		int level = this.health -=3*3;
		System.out.println("Bola de fuego... "+level);		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	
	
}
