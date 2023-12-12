package exercice4;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {

		int nombreUtilisateur;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ecrire le nombre :");
		nombreUtilisateur = scanner.nextInt();
	
		int i = 1;
		while(i < nombreUtilisateur)
		{
			System.out.println(i);
			i++;
		}

	}

}
