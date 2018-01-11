package TP2;

import java.util.Scanner;

import javax.print.attribute.standard.JobOriginatingUserName;

public class ancienneDate {
/* Exercice 11 : 
 * Écrivez une fonction qui prend en argument deux dates 
 * (sous la forme de 3 entiers chacune), 
 * puis affiche la plus ancienne des deux. */
	
	public static void main(String[] args) {
		int jour1, mois1, annee1, jour2, mois2, annee2;
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez le jour de la première date");
		jour1 = saisie.nextInt();
		System.out.println("Entrez le mois");
		mois1 = saisie.nextInt();		
		System.out.println("Entrez l'année");
		annee1 = saisie.nextInt();
		
		System.out.println("Entrez le jour de la deuxième date");
		jour2 = saisie.nextInt();
		System.out.println("Entrez le mois");
		mois2 = saisie.nextInt();
		System.out.println("Entrez l'année");
		annee2 = saisie.nextInt();
		
		if( jour1-jour2 > 0 || (jour1-jour2 == 0 && (mois1-mois2==0 && annee1-annee2 > 0))){
			System.out.println("La date la plus ancienne est le : " + jour2+ "/" +mois2+ "/" +annee2);
		} else {
			System.out.println("La date la plus ancienne est le : " + jour1+ "/" +mois1+ "/" +annee1);
		}
		
	}

}
