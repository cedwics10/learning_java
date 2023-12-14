package exercice9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int entree, index, valeur;
		
		int taille = 5;
		ArrayList<Integer> entiers = new ArrayList();
		
		for(int i = 0; i < taille; i++)
		{
			System.out.println("Donnez un entier : ");
			entree = clavier.nextInt();
			entiers.add(entree);
		}
		
		System.out.println(entiers);
		
		System.out.println("Donner un index : ");
		index = clavier.nextInt();
		System.out.println("Nouvelle valeur de l'index : ");
		valeur = clavier.nextInt();
		
		entiers.set(index, valeur);
		
		System.out.println(entiers);
	}

}
