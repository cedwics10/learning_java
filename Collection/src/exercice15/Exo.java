package exercice15;

import java.util.ArrayList;
import java.util.Collections;

public class Exo {

	public static void main(String[] args) {
		// �crivez un programme Java pour m�langer al�atoirement � chaque ex�cution
		// les �l�ments d�un ArrayList. 
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
