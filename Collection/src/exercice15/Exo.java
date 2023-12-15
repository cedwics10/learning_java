package exercice15;

import java.util.ArrayList;
import java.util.Collections;

public class Exo {

	public static void main(String[] args) {
		// Écrivez un programme Java pour mélanger aléatoirement à chaque exécution
		// les éléments d’un ArrayList. 
		ArrayList<String> languages = new ArrayList();
		ArrayList<String> frameworks = new ArrayList();
		
		
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		
		languages.add("Spring");
		languages.add("Angular");
		languages.add("Laravel");
		languages.add("Symfony");
		

		languages.addAll(frameworks);
		Collections.shuffle(languages);

		
		System.out.print(languages);
	}

}
