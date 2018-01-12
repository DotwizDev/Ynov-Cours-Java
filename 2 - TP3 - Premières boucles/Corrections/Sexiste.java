package TP3;

import java.util.Scanner;

public class Sexiste {

	public static void main(String[] args) {
		int n;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez le premier chiffre de sécurité sociale :");
		n = saisie.nextInt();
		
		if(n == 1){
			System.out.println("Bonjour, Monsieur");
		} else if (n == 2){
			System.out.println("Bonjour, madame");
		} else {
			System.out.println("Bonjour, alien");
		}
	}

}
