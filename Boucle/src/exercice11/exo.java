package exercice11;

import java.util.Scanner;

/*
 * Ecrire un algorithme qui demande de saisir au clavier les prix de 10 articles 
 * et qui calcule et affiche le nombre d’articles dont le prix est inférieur a 30€.
 * 
 */
public class exo {

	public static void main(String[] args) {

		int nombre, nombreArticles = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Saisissez un nombre");
			nombre = scanner.nextInt();
			
			nombreArticles += (nombre < 30) ? 1 : 0;
		}
		
		System.out.println("Il y a " +nombreArticles + " articles qui coûtent moins de 30€." );
	}

}
