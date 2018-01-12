package TP3;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		int nombre;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez un entier");
		nombre = saisie.nextInt();
		
		for(int i=1; i<=10; i++){
			System.out.println(i*nombre);
		}
	}
}
