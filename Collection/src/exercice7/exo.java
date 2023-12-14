package exercice7;

import java.util.ArrayList;

public class exo {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList();
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		languages.remove(2);
		
		System.out.println(languages);
	}

}
