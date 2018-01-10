package TP1;

import java.util.Scanner;

public class Bissextiles {

	public static void main(String[] args) {
		int annee;
		boolean r;
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez un année");
		annee = saisie.nextInt();
		r = ((annee%4==0) && (!(annee%100==0) || (annee%400==0)));
		System.out.println("L'année " + annee + " est bissextile = " + r);
	}
}
