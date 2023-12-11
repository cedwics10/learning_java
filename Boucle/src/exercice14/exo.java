package exercice14;

import java.util.Scanner;


public class exo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombreEtoiles;
		String etoile = "*";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez le nombre d'étoiles : ");
		
		nombreEtoiles = scanner.nextInt();

		for(int i = 1; i <= nombreEtoiles; i--)
		{
			System.out.println(etoile.repeat(nombreEtoiles));
		}
	}

}