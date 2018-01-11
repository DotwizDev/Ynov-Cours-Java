package TP2;

import java.util.Scanner;

public class vecteurs {
/* Exercice 10 : 
 * Écrivez une fonction qui détermine si deux vecteurs dans R2 
 * donnés par leurs coordonnées respectives ne sont pas colinéaires, 
 * et s’ils ne le sont pas affiche l’angle, exprimé en radians, entre les deux vecteurs. */
	
	public static void main(String[] args) {
		double x1, y1, x2, y2;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez un premier vecteur en R^2");
		System.out.println("Ecomposante x1 : ");
		x1 = saisie.nextDouble();
		System.out.println("Ecomposante y1 : ");
		y1 = saisie.nextDouble();

	
		System.out.println("Entrez un deuxième vecteur en R^2");
		System.out.println("Ecomposante x2 : ");
		x2 = saisie.nextDouble();
		System.out.println("Ecomposante y2 : ");
		y2 = saisie.nextDouble();
		
		if (x1*y2 == x2*y1){
			System.out.println("Les deux vecteurs sont collinéaires.");
		} else {
			System.out.println("Les deux vecteurs ne sont pas collinéaires.");
			System.out.println("L'angle entre les deux vecteurs est : " 
			+ Math.acos((x1*x2*y1*y2) / Math.sqrt((x1*x1+y1*y1))*(x2*x2+y2*y2)));
		}
		
	}
}
