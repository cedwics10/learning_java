package exercice5;

import java.util.ArrayList;

public class exo {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList();
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		
		String troisiemeElement = languages.get(2);
		
		System.out.println("Le troisième élément est : " + troisiemeElement);
	}

}
