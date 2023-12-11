package exercice3;

import java.util.Scanner;

/* 
 * 3-    Ecrire un algorithme qui demande un nombre de départ, et qui ensuite écrit la table de multiplication de ce nombre, présentée comme suit (cas où l'utilisateur entre le nombre 7) :

 * Table de 7 : 
 * 7 x 1 = 7 
 * 7 x 2 = 14 
 * 7 x 3 = 21 
 * … 
 * 7 x 10 = 70
 */
public class exo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisissez un nombre");
		
		int nombre = scanner.nextInt();
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(nombre + " * " + i + " = " + (i * nombre));
		}
		
	}

}
