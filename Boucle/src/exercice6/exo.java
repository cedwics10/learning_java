package exercice6;

import java.util.Scanner;

public class exo {
	/*
	 * �crire un algorithme qui demande � l'utilisateur deux nombres et qui affiche
	 * les nombres du plus petit au plus grand. Ex : Donnez le nbr 1 : 9 Donnez le
	 * nbr 2 : 4 Le programme : 4 5 6 7 8 9
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int copy;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Saisissez le premier nombre");
		int nombreUn = scanner.nextInt();
		
		System.out.println("Saisissez le deuxi�me  nombre");
		int nombreDeux = scanner.nextInt();

		if (nombreUn > nombreDeux) {
			copy = nombreUn;
			nombreUn = nombreDeux;
			nombreDeux = copy;
		}
		
		for(int i = nombreUn + 1; i < nombreDeux; i++)
		{
			System.out.println(i + "");
		}

	}

}
