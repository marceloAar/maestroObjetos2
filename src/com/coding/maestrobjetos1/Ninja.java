//Marcelo Aceituno R
//Full Stack JAVA 0034
//Maestro de Objetos: Parte 2
package com.coding.maestrobjetos1;

public class Ninja extends Human{
	
	//Ninja: Establecer un valor predeterminado de stealth en 10.
	//Ninja: Agregar un método steal(Human) que roba la cantidad de puntos que tenga el Ninja 
	//en stealth de la salud del otro Human y los agrega a la health del Ninja.
	//Ninja: Agregar un método runAway() que reduce su salud en 10.	

	private int stealth = 10;
		
	public void runAway() {
		int salud = this.stealth -=5;
		System.out.println("Ninja corriendo... "+salud+" pts.");
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}	
	
}
