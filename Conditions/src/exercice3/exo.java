package exercice3;

import java.util.Scanner;

public class exo {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int nombre;
		
		System.out.println("Entrez un nombre");
		nombre = clavier.nextInt();
		String texte = (nombre > 0) ? "Le nombre est positif ": 
			"Le nombre est négatif";
		
		System.out.println(texte);
			
		

	}
}
