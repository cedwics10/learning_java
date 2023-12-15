package exercice17;

import java.util.ArrayList;
import java.util.List;

public class exo {
	/*
	 * Écrivez un programme Java pour extraire et afficher les 2 derniers éléments
	 * d’un ArrayList Exemple : COL1 : [1,2,3,4,5,6] Sortie prévue : Les 2 derniers
	 * éléments : [5, 6]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nombres = new ArrayList();
		List<Integer> lastNombres = new ArrayList<Integer>();
		
		nombres.add(1);
		nombres.add(2);
		nombres.add(3);
		nombres.add(4);
		nombres.add(5);
		nombres.add(6);

		lastNombres = nombres.reversed().subList(0, 2);
		System.out.println(lastNombres);
		// System.out.println(twoLastNombres);
	}

}
