package exercice10;

import java.util.Scanner;

public class exo {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int ageEnfant;
		String categorie;

		System.out.println("Entrez un premier nombre :");
		ageEnfant = clavier.nextInt();
		
		if(ageEnfant < 6)
			categorie = "Aucune catégorie";
		else if (ageEnfant <= 7)
			categorie = "Poussin";
		else if (ageEnfant <= 9)
			categorie = "Pupille";
		else if (ageEnfant <= 11)
			categorie = "Minime";
		else
			categorie = "Cadet";

		System.out.println("L'enfant est dans la catégorie : " + categorie);

	}
}
