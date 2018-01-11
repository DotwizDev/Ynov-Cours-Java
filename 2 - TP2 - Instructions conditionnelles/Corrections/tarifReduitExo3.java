package TP2;

import java.util.Scanner;

public class tarifReduitExo3 {
/* Exercice 3 : 
 * Modifiez la fonction tarif Réduit pour qu’elle n’utilise qu’une seule instruction conditionnelle if. */
	
	// Le @SuppressWarnings n'est utilisé que pour cacher les warning de couleur jaune
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int age;
		int limite26 = 26;
		int limite60 = 60;

		//Par défaut personne n'a le droit au tarif réduit !
		boolean tarifReduit = false;
		
		// Le @SuppressWarnings n'est utilisé que pour cacher les warning de couleur jaune
		@SuppressWarnings("resource")
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez l'âge du capitaine : ");
		age = saisie.nextInt();
		
		if(age<limite26 || age>limite60) {
			System.out.println("Vous avez le droit au tarif réduit !");		
		} else {
			System.out.println("Dommage ... ");
		}
	}
}