package exercice5;

import java.util.Scanner;

/* 
 * Écrire un algorithme qui demande à l'utilisateur un nombre et qui affiche les nombres pairs de 1 jusqu’à ce nombre.
 * Ex : les nombres pairs de 1 à 11 sont : 2 4 6 8 10
 */
public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisissez un nombre");
		
		int nombre = scanner.nextInt();
		
		for(int i = 1; i <= nombre; i++)
		{
			if(i % 2 == 1)
			System.out.println(i);
		}
	}

}
