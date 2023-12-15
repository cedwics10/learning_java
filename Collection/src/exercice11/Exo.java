package exercice11;

import java.util.ArrayList;
import java.util.Collections;

public class Exo {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList();
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		
		Collections.sort(languages);
		System.out.println(languages);
	}

}
