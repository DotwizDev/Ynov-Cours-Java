package TP3;

import java.util.Scanner;

public class Moutons {

	public static void main(String[] args) {
		int nombre;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Combien de moutons ?");
		nombre = saisie.nextInt();
		for(int i=1; i <= nombre; i++){
			System.out.println(i + " moutons");
		}
	}
}
