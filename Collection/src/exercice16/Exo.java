package exercice16;

import java.util.ArrayList;

public class Exo {
	
	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList();
		ArrayList<String> languages2 = new ArrayList();

		
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		
		languages.add("Spring");
		languages.add("Angular");
		languages.add("Laravel");
		languages.add("Symfony");
		
		languages.subList(1,4);

		languages2.addAll(languages);
		
		System.out.print(languages2);
	}
}
