package TP1;

import java.util.Scanner;

public class ConversionSecondes {

	public static void main(String[] args) {
		int dureeSeconde, heure, minute, seconde;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Entrez la durée en seconde");
		dureeSeconde = saisie.nextInt();
	
		heure = dureeSeconde / 3600;
		dureeSeconde = dureeSeconde%3600;
		minute = dureeSeconde / 60;
		seconde = dureeSeconde%60;
	
		System.out.println("La durée est de " + heure + " heures " + minute + " minutes et " + seconde + " secondes.");
	
	}

}
