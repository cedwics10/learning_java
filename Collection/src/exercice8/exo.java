package exercice8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int entree, max, min;
		
		int taille = 5;
		ArrayList<Integer> entiers = new ArrayList();
		
		for(int i = 0; i < taille; i++)
		{
			System.out.println("Donnez un entier : ");
			entree = clavier.nextInt();
			entiers.add(entree);
		}
		
		max = Collections.max(entiers);
		min = Collections.min(entiers);
		
		System.out.println("Le maximum est " + max + ".");
		System.out.println("Le minimum est " + min + ".");
	}

}
