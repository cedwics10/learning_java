package exercice10;

import java.util.ArrayList;
import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		String recherche;
		boolean isSet;
		Scanner clavier = new Scanner(System.in);
		ArrayList<String> languages = new ArrayList();
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");

		System.out.println("Taper la valeur à chercher");

		recherche = clavier.next();
		isSet = languages.contains(recherche);

		if (isSet)
			System.out.println("Oui : index = " + isSet);
		else
			System.out.println("Non");

	}

}
