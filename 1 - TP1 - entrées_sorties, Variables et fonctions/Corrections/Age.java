package TP1;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		int anneeActuelle, anneeNaissance, age;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Année actuelle : \n");
		anneeActuelle = saisie.nextInt();
		System.out.println("Année de naissance : \n");
		anneeNaissance = saisie.nextInt();
		age = anneeActuelle - anneeNaissance;
		
		System.out.println("Votre anniversaire est déjà passé, vous avez " + age + ", sinon vous en avez " + (age-1));
	}

}
