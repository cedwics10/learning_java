package exercice16;

import java.util.ArrayList;
import java.util.List;

public class Exo {
	
	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList();
		List<String> languages2;

		
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		
		languages.add("Spring");
		languages.add("Angular");
		languages.add("Laravel");
		languages.add("Symfony");
		
		languages2 = languages.subList(0,4);
		
		System.out.print(languages2);
	}
}
