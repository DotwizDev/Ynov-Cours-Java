package TP1;

import java.util.Scanner;

public class Conversion {
	public static float celsius2Fahrenheit(float celsius){
		float fahrenheit;

		fahrenheit = 9 * celsius / 5 + 32;
		return fahrenheit;
	}
	
	public static void main (String [] args){
		float fahrenheit, celsius;
		Scanner saisie = new Scanner(System.in);

		System.out.println("Entrez la température en degrés Celsius");
		celsius = saisie.nextFloat();

		// Appel de la fonction celsius2Fahrenheit(celsius)
		fahrenheit = celsius2Fahrenheit(celsius);
		System.out.println("La température en degrés Farenheit est : " + fahrenheit);
	}
}
