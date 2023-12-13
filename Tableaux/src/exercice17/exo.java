package exercice17;

import java.util.Arrays;
import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Indiquer la taille du tableau");
		int taille = clavier.nextInt();
		int[] tableau = new int[taille];
		for (int i = 0; i < taille; i++) {
			System.out.println("Indiquer la valuer de l'élément " + i);
			tableau[i] = clavier.nextInt();
		}
		
		int maximum = 0;
		int cle = -1;
		
		for (int i = 0; i < taille; i++) {
			if(i == 0 || tableau[i] > maximum)
			{
				maximum = tableau[i];
				cle = i;
			}
		}	
		
		System.out.println("Le maximum est la valeur"
		+ maximum + " à la clé " + cle);
		
		
	}

}
