package exercice23;

import java.util.Scanner;

public class exo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		int[] tab = {55,82,57,105,23,95,315};
		
		System.out.println("Le tableau :");
		for(int i = 0; i < tab.length; i++)
		{
			System.out.print(tab[i] + " ");
		}
		
		System.out.println(""); // saut de ligne
		
		System.out.println("Saisir la clé de la valeur à échanger :");
		int cle = clavier.nextInt();
		
		System.out.println("Avec quelle clé l'échange-t-on  ?");
		int echange = clavier.nextInt();
				
		
		System.out.println("Le nouveau tableau :");
		for(int i = 0; i < tab.length; i++)
		{
			int cleAffiche = i;
			if(i == echange)
				cleAffiche = cle;
			else if(i == cle)
				cleAffiche = echange;
			System.out.print(tab[cleAffiche] + " ");
		}
		
		
	}

}
