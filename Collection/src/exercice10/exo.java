package exercice10;

import java.util.ArrayList;
import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		String recherche;
		int index;
		Scanner clavier = new Scanner(System.in);
		ArrayList<String> languages = new ArrayList();
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");

		System.out.println("Taper la valeur � chercher");

		recherche = clavier.next();
		index = languages.indexOf(recherche);

		if (index != -1) {
			System.out.println("Oui : index = " + index);
		} else {
			System.out.println("Non");
		}
	}

}
