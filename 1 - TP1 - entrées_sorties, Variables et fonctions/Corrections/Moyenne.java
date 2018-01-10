package TP1;

import java.util.Scanner;

public class Moyenne {
	public static void main(String[] args){
		float note1, note2, note3, note4, moyenne, somme;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez la première note : ");
		note1 = saisie.nextFloat();
		System.out.println("Entrez la deuxième note : ");
		note2 = saisie.nextFloat();
		System.out.println("Entrez la troisième note : ");
		note3 = saisie.nextFloat();
		System.out.println("Entrez la quatrième note : ");
		note4 = saisie.nextFloat();
	
		somme = note1 + note2 + note3; 
		System.out.println("La somme est : " + somme);
	
		moyenne = somme / 4;
		System.out.println("La moyenne est : " + moyenne);
	}
}
