package TP2;

import java.util.Scanner;

public class tarifReduitExo2 {
/* Exercice 2 : 
 * Le capitaine ayant rarement moins de 26 ans,
 * modifiez la fonction tarif Réduit pour que les plus de 60 ans aient aussi le droit au tarif réduit. */
	
	public static void main(String[] args) {
		int age;
		int limite26 = 26; // 26 ans max
		int limite60 = 60; // 60 ans min

		//Par défaut personne n'a le droit au tarif réduit !
		boolean tarifReduit = false;
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez l'âge du capitaine : ");
		age = saisie.nextInt();
		
		if(age<limite26) {
			System.out.println("Vous avez le droit au tarif réduit !");		
		} else if(age>limite60) {
			System.out.println("Vous avez le droit au tarif réduit !");		
		} else {
			System.out.println("Dommage ... ");
		}
	}
}