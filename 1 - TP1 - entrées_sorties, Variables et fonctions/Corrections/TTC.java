package TP1;

import java.util.Scanner;

public class TTC {
	public static void main (String [] args){
		float hc, tva, ttc;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez le taux de TVA en % : ");
		tva = saisie.nextFloat();
		System.out.println("Entrez le prix hors taxes");
		hc = saisie.nextFloat();
		
		ttc = hc + hc * tva / 100;
		System.out.println("Le prix toutes taxes comprises est : " + ttc);
	}
}
