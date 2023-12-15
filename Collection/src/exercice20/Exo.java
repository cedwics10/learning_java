package exercice20;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		String entree, recherche;
		int cleRecherche;
		ArrayList<String> liste = new ArrayList();

		System.out.println("Vérifier les éléments d'une collection:\n Créeons la collections !!");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Taper un nouvel élément de la collcetion :");
			// clavier.nextLine();
			entree = clavier.nextLine();
			liste.add(entree);
		}
		
		System.out.println("Taper une valeur pour vé&rifier son existence :");

		recherche = clavier.nextLine();
		
		cleRecherche = liste.indexOf(recherche);
		
		if(cleRecherche >= 0)
		{
			System.out.print("Trouvé en position " + cleRecherche);
		}
		else
		{
			System.out.print("L'élément recherché est introvable");
		}
	}

}
