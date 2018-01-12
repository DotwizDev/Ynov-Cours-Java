package TP3;

import java.util.Scanner;

public class Regle {

	public static void main(String[] args) {
		int nombre;
		Scanner saisie = new Scanner(System.in);
		System.out.print("Entrez un entier \n");
		nombre = saisie.nextInt();
		
		for(int i=1; i<=nombre; i++){
			System.out.print('-');			
		}
		System.out.println();
	}

}
