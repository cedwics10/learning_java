package exercice1;

import java.util.Scanner;

public class exo {
	/*
	 * �crire un algorithme qui demande � l'utilisateur un nombre et qui affiche les
	 * nombres de 1 jusqu�� ce nombre.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisissez un nombre");
		
		int nombre = scanner.nextInt();
		
		for(int i = 1; i <= nombre; i++)
		{
			System.out.println(i);
		}
		

	}
}
