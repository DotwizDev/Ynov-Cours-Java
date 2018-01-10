package TP1;

import java.util.Scanner;

public class Cercle {
	public static void main (String [] args){
		Double rayon, perimetre, surface;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez le rayon du cercle");
		rayon = saisie.nextDouble();

		perimetre = 2 * Math.PI * rayon ;
		System.out.println("Le prémiètre est :" + perimetre);
		surface = Math.PI * rayon * rayon ;

		System.out.println("La surface est : " + surface) ;
		
	}
}
