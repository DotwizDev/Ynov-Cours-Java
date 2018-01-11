package TP2;

import java.util.Scanner;

public class saison {
/*
 * Exercice 4: Écrivez une fonction saison qui prend en argument un caractère (type char), puis renvoie le nom de la saison correspondante sous forme de chaîne de caractères :
 * 	"printemps" si l’argument est ’p’,
 * 	" été " si l’argument est ’e’,
 * 	"automne" si l’argument est ’a’,
 * 	" hiver " si l’argument est ’h’,
 * 	null si le caractère fourni en argument n’est pas un des caractères précédents. */
	
	public static void main(String[] args) {
		char lettre;
		String saison = "";
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Entrez la première lettre de la saison : ");
		// Méthode pour récupèrer un charatère en saisie avec scanner ;)
		lettre = saisie.next().charAt(0);;
		
		saison(lettre);
	}

	public static String saison(char lettre){
		String saison = "";
		// On vérifie et alloue une valeur en fonction de la saisie
		if (lettre == 'p' || lettre == 'P'){
			System.out.println("Printemps");
		} else if (lettre == 'e' || lettre == 'E') {
			System.out.println("Eté");
		} else if (lettre == 'h' || lettre == 'H'){
			System.out.println("Hiver");
		} else if (lettre == 'a' || lettre == 'A') {
			System.out.println("Automne");
		} 
		// Pour les malins qui vont tester des lettres en random
		else {
			System.out.println("Ce n'est pas une saison");
		}
		return saison;
	}
}
