package exercice7;

import java.util.Scanner;

/* 
 * Ecrire un algorithme qui demande un nombre de départ, 
 * et qui calcule la somme des entiers jusqu’à ce nombre. 
 * Par exemple, si l’on entre 5, le programme doit calculer :
 * 1 + 2 + 3 + 4 + 5 = 15
 * 
 */
public class exo {

	public static void main(String[] args) {
		int total = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Saisissez un nombre");
		int nombre = scanner.nextInt();

		for (int i = 1; i <= nombre; i++) {
			total = total + i;
			System.out.print(i);
			if(i < nombre)
				System.out.print(" + ");
		}
		
		System.out.println(" = " + total);
	}

}
