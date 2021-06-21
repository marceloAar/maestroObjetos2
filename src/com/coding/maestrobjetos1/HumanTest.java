//Marcelo Aceituno R
//Full Stack JAVA 0034
//Maestro de Objetos: Parte 2
package com.coding.maestrobjetos1;

public class HumanTest {

	public static void main(String[] args) {
		
		Human humano = new Human();
		Wizard mago = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		
		humano.attack();	
		
		mago.heal();
		mago.fireBall();
		
		ninja.runAway();
		
		samurai.meditate();
		samurai.howMany();		

	}

}
