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

		System.out.println("V�rifier les �l�ments d'une collection:\n Cr�eons la collections !!");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Taper un nouvel �l�ment de la collcetion :");
			// clavier.nextLine();
			entree = clavier.nextLine();
			liste.add(entree);
		}
		
		System.out.println("Taper une valeur pour v�&rifier son existence :");

		recherche = clavier.nextLine();
		
		cleRecherche = liste.indexOf(recherche);
		
		if(cleRecherche >= 0)
		{
			System.out.print("Trouv� en position " + cleRecherche);
		}
		else
		{
			System.out.print("L'�l�ment recherch� est introvable");
		}
	}

}
