package TP1;

import java.util.Scanner;

public class Lettre {

	public static void main(String[] args) {
		String chargeeDeTP, etudiant;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Entrez le nom du chargé de TP");
		chargeeDeTP = saisie.nextLine();
		
		System.out.println("Entrez le prénom de l'étudiant :");
		etudiant = saisie.nextLine();
		
		System.out.println("Cher " + chargeeDeTP + ",");
		System.out.println("J'adore vos TPs, ils sont tellement \"bien\" !");
		System.out.println("Signé " + etudiant + ".");
	}

}
