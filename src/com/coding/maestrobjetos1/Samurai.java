//Marcelo Aceituno R
//Full Stack JAVA 0034
//Maestro de Objetos: Parte 2
package com.coding.maestrobjetos1;

public class Samurai {
	
	//**Samurai: Establecer un valor predeterminado de health en 200.
	//Samurai: Agregar un m�todo deathBlow(Human) que asesina al otro Human y reduce la health del Samurai a la mitad.
	//Samurai: Agregar un m�todo meditate() que curar� al Samurai en la mitad de puntos que tenga de health.
	//Samurai: Agregar un m�todo howMany() que devuelve el n�mero actual del Samurai.
	
	private int health = 200;	
	
	public void meditate() {
		int curar = this.health += health/2;
		System.out.println("Samurai meditando.... "+curar+" pts.");		
	}
	
	public void howMany() {		
		System.out.println("Puntos del samurai... "+this.health+" pts.");
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
