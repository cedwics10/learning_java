package exercice12;

import java.util.ArrayList;
import java.util.Collections;

public class Exo {

	public static void main(String[] args) {
		int taille;
		
		ArrayList<String> languages = new ArrayList();
		
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		
		taille = languages.size();
		
		ArrayList<String> languages2 = new ArrayList(Collections.nCopies(taille, "0"));

		
		
		for(int i = 0; i < taille; i++)
		{
			languages2.set(taille-1-i, languages.get(i));
		}
		
		System.out.println(languages2);
		
	}

}
