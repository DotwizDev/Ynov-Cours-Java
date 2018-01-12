package TP3;

import java.util.Scanner;

public class RegleGraduee {

	public static void main(String[] args) {
		int longueur, intervalle;
		Scanner saisie = new Scanner(System.in);
		System.out.print("Longueur ? : \n");
		longueur = saisie.nextInt();
		System.out.print("Intervalle ? : \n");
		intervalle = saisie.nextInt();
		
		for(int i=1; i<=longueur; i++){
			if(i%intervalle==1){
				System.out.print('|');
			} else {
				System.out.print('-');	
			}
		}
		System.out.println();
	}

}
