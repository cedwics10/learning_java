package exercice14;

import java.util.ArrayList;
import java.util.Collections;

public class Exo {

	public static void main(String[] args) {
		// 14-	Écrivez un programme Java pour copier les éléments d’un ArrayList à la fin d'un autre Et ensuite les trier par ordre croissant. 

		ArrayList<String> languages = new ArrayList();
		ArrayList<String> frameworks = new ArrayList();
		
		
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		
		frameworks.add("Spring");
		frameworks.add("Angular");
		frameworks.add("Laravel");
		frameworks.add("Symfony");
		

		languages.addAll(frameworks);
		Collections.sort(languages);


		
		System.out.print(languages);
	}

}
