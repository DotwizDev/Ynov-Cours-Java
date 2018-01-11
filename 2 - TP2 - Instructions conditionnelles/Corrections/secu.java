package TP2;

import java.util.Scanner;

public class secu {
/*Exercice 5 : 
 * Écrivez une fonction sécu qui demande le premier chiffre du numéro de sécurité sociale de Claude, 
 * puis affiche « Bonjour Madame Claude » ou « Bonjour Monsieur Claude ».
 * Modifiez votre fonction pour que dans le cas où le nombre rentré n’est ni 1 ni 2, 
 * il affiche « Bonjour Martien Claude ».
 * Modifiez enfin votre fonction pour que dans le cas d’une femme, 
 * il demande aussi à Claude si elle préfère être appelée madame ou mademoiselle.*/

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez le premier chiffre du numéro de sécurité sociale de Claude : ");
		int chiffre = saisie.nextInt();
		secu(chiffre);
	}
	
	public static String secu(int chiffre){
		String message = "";
		if(chiffre == 1){
			System.out.println("Bonjour Monsieur Claude");
		} else if (chiffre == 2){
			Scanner saisie = new Scanner(System.in);
			System.out.println("Vous préfèrez d'être appelé Madame plutôt que Mademoiselle ? (o oui n)");
			String preference = saisie.nextLine();
			if(preference.equals("oui") || preference.equals("Oui") || preference.equals("OUI")){
				System.out.println("Bonjour Madame Claude");
			} else {
				System.out.println("Bonjour Mademoiselle Claude");
			}
		} else {
			System.out.println("Bonjour Martien Claude");
		}
		return message;
	}
}
