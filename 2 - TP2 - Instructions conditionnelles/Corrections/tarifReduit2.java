package TP2;

import java.util.Scanner;

public class tarifReduit2 {
/* Exercice 9 : 
 * Écrivez une fonction TarifReduit2 qui prend en argument la date du jour 
 * (sous la forme de 3 entiers) et la date de naissance du capitaine (idem) 
 * puis affiche si le capitaine a le droit au rabais de 25% sur le plein tarif 
 * qui est accordé aux moins de 26 ans. */
	
	public static void main(String[] args) {
		int jour, mois, annee, jourAnnif, moisAnnif, anneeAnnif;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Quelle est la date du jour ? : \n");
		jour = saisie.nextInt();
		mois = saisie.nextInt();
		annee = saisie.nextInt();
		
		System.out.println("Quelle est votre date de naissance ? : \n");
		jourAnnif = saisie.nextInt();
		moisAnnif = saisie.nextInt();
		anneeAnnif = saisie.nextInt();
		
		tarifReduit2(jour, mois, annee, jourAnnif, moisAnnif, anneeAnnif);
	}

	public static void tarifReduit2(int jour, int mois, int annee, int jourAnnif, int moisAnnif, int anneeAnnif){
		if (jour-jourAnnif > 26 || ( jour-jourAnnif==26 && (mois-moisAnnif > 0 || (mois-moisAnnif==0 && annee-anneeAnnif>0)))){
			System.out.println("Plein tarif");
		} else {
			System.out.println("Tarif réduit");
		}
	}
}
