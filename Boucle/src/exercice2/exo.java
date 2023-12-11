package exercice2;

// TODO Auto-generated method stub
/*
 * Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche
 * les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17,
 * le programme affichera les nombres de 18 à 27.
 * 
 */

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisissez un nombre");
		
		int nombre = scanner.nextInt();
		
		for(int i = nombre + 1; i <= nombre + 10; i++)
		{
			System.out.println(i);
		}
		

	}

}
