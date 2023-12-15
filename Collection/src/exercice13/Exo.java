package exercice13;

import java.util.ArrayList;

public class Exo {
/*

13-	Écrivez un programme Java pour copier un ArrayList dans un autre. 
Exemple : 
Langages : [PHP, Java, C++,Python] 
Frameworks : [Spring, Angular, Laravel, Symfony] 
Sortie prévue : 
Langages : [PHP, Java, C++,Python] 
Frameworks : [Spring, Angular, Laravel, Symfony] 
copie… 
Langages : [Spring, Angular, Laravel, Symfony] 
Frameworks : [Spring, Angular, Laravel, Symfony] 

 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		

		languages.addAll(languages);

// 		taille = frameworks.size();
//	ou :	for(int i = 0; i < taille; i++)
//		{
//			languages.add(frameworks.get(i));
//		}
		
		System.out.print(languages);
	}

}
