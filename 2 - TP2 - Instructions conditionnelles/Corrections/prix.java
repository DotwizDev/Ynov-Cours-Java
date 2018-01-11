package TP2;

import java.util.Scanner;

public class prix {
/* Exercice 6 : 
 * Écrivez une fonction prix qui prend en argument le prix d’un kilo de pommes, 
 * et le nombre de kilos achetés, puis renvoie le prix à payer, 
 * sachant que pour trois kilos ou plus achetés, 
 * le vendeur fera un rabais de 10% et que pour cinq kilos ou plus le rabais sera de 15%*/
	
	public static void main(String[] args) {
		float prix, n;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez le prix d'un kilo de pommes.");
		prix = saisie.nextFloat();
		System.out.println("Entrez le nombre de kilos achetés.");
		n = saisie.nextFloat();
		
		if(n >= 5){
			System.out.println("Le prix à payer est de " + (prix*n*85/100));
		} else if (n >= 3) {
			System.out.println("Le prix à payer est de " + (prix*n*90/100));
		} else { 
			System.out.println("Le prix à payer est de " + prix*n);
		}
	}

}
