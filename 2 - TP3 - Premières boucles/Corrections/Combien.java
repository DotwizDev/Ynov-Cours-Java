package TP3;

import java.util.Scanner;

public class Combien {

	public static void main(String[] args) {
		int n;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez un entier positif :");
		n = saisie.nextInt();
		
		if(n == 0){
			System.out.println("Aucun");
		} else if (n == 1){
			System.out.println("un");
		} else if (n == 2){
			System.out.println("deux");
		} else {
			System.out.println("Plusieurs");
		}
	}

}
