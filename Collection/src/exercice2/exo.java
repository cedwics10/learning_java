package exercice2;

import java.util.ArrayList;

public class exo {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList();
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		
		for(int i = 0; i < languages.size(); i++)
		{
			System.out.println(languages.get(i));
		}
		
	}

}
