package TP2;

import java.util.Scanner;

public class tarifReduit {
/* xercice 1 : 
 * Écrivez une fonction tarif Réduit qui prend en argument l’âge du capitaine 
 * et affiche s’il a le droit au tarif réduit (moins de 26 ans). */
	
	public static void main(String[] args) {
		int age;
		int limite26 = 26; // 26 ans max
		//Par défaut personne n'a le droit au tarif réduit !
		boolean tarifReduit = false;
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez l'âge du capitaine : ");
		age = saisie.nextInt();
		
		if(age<limite26) {
			System.out.println("Vous avez le droit au tarif réduit !");		
		} else {
			System.out.println("Dommage ... ");
		}
	}
}