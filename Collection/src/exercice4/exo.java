package exercice4;

import java.util.ArrayList;

public class exo {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList();
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		languages.add(0,"Zack");
		
		if(languages.isEmpty())
			System.out.println("La collection est vide");
		else
			System.out.println("La collection n'est pas vide");
		
	}

}
