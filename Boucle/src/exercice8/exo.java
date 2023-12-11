package exercice8;

import java.util.Scanner;

/* 
 * Ecrire un algorithme qui demande un nombre de départ, et qui calcule sa factorielle. 
 * NB : la factorielle de 8, notée 8 ! vaut 
 * 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8
 * 
 */
public class exo {

	public static void main(String[] args) {
		int total = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Saisissez un nombre");
		int nombre = scanner.nextInt();

		for (int i = 1; i <= nombre; i++) {
			total = total * i;
			System.out.print(i);
			if(i < nombre)
				System.out.print(" * ");
		}
		
		System.out.println(" = " + total);
	}

}
