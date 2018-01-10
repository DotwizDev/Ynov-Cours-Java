package TP1;

import java.util.Scanner;

public class Croissants {
	public static void main (String [] args){
		int a, b, c;
		boolean resultat;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Entrez 3 entiers : ");
		a = saisie.nextInt();
		b = saisie.nextInt();
		c = saisie.nextInt();
		resultat = (a<b) && (b<c);
		
		System.out.println(resultat);
	}
}
