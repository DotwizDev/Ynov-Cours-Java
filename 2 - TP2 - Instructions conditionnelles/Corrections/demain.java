package TP2;

import java.util.Scanner;

public class demain {
/* Exercice 8 : 
 * Écrivez une fonction demain qui prend en argument trois entiers constituant une date supposée correcte, 
 * puis affiche la date du lendemain.*/
	
	public static void main(String[] args) {
		int jour, mois, annee;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez le jour :");
		jour = saisie.nextInt();
		System.out.println("Entrez le mois :");
		mois = saisie.nextInt();
		System.out.println("Entrez l'année :");
		annee = saisie.nextInt();
		
		demain(jour,mois,annee);
	}

	public static void demain(int jour, int mois, int annee){
		if (jour == 30){
			if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
				jour = jour + 1;
				// OU jour ++;
			} else {
				jour = 1;
				mois = mois + 1; // OU mois++;
			}
		} else if ( jour == 31){
			if (mois == 12){
				jour = 1;
				mois = 1;
				annee = annee + 1;
			} else {
				jour = 1;
				mois = mois + 1;
			}
		} else if ( mois != 2) {
			jour = jour + 1;
		} else if (jour <=27 || (jour == 28 && annee%4==0 && (annee%100!=0 || annee%400==0))){
			jour = jour + 1;
		} else {
			jour = 1;
			mois = mois + 1;
		}
		
		System.out.println(" Demain sera le : " + jour + "/" + mois + "/" + annee);
	}
}
