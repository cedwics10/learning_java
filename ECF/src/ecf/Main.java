package ecf;

public class Main {

	public static void main(String[] args) {
		multipleDeTrois(12);
	}

	/* Exercice 1 */
	public static String resultat(Double note1, Double note2, Double note3) {
		final String FAIL = "Echoué";
		final String SUCCESS = "Réussi";

		if (note1 < 12)
			return FAIL;

		if (note2 < 12)
			return FAIL;

		if (note3 < 12)
			return FAIL;

		return SUCCESS;
	}

	/* Exercice 2 */
	public static void multipleDeTrois(int n) {
		System.out.print("Les multiples de 3 entre 1 et " + n + " sont : ");

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0)
				System.out.print(i + " ");
		}

	}

	/* Exercice 3 */
	public static void produitElementTab(int[] T) {
		int produit = 1;

		for (int i = 0; i < T.length; i++) {
			if (T[i] == 0) {
				produit = 0;
				break;
			}

			produit *= T[i];
		}

		System.out.print("Le produit est : " + produit);
	}

	/* Exercice 4 */
	public static void afficheEntiers(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.print("M57");
			} else if (i % 7 == 0) {
				System.out.print("M7");
			} else if (i % 5 == 0) {
				System.out.print("M5");
			} else {
				System.out.print(i);
			}

			System.out.print(" ");
		}
	}

	/* Exercice 5 */
	public static void genererMot(char[] tab1, int[] tab2) {
		int lengthcharTable = tab1.length;
		int lengthIntTable = tab2.length;
		if (lengthcharTable != lengthIntTable) {
			System.out.println("Erreur");
			return;
		}

		for (int c = 0; c < lengthIntTable; c++) {
			for (int i = 1; i <= tab2[c]; i++) {
				System.out.print(tab1[c]);
			}
		}

	}

	/* Exercice 6 */
	public static boolean parfait(int k) {
		int sommeDiviseurs = 0;

		for (int i = 1; i < k; i++) {
			if (k % i == 0)
				sommeDiviseurs += i;
		}

		return (sommeDiviseurs == k);
	}

	/* Exercice 7 */
	public static void sommeHarmonique(int n) {
		double somme = 0;

		for (double i = 1; i <= n; i++) {
			somme += (1 / i);
		}

		System.out.println("La somme des " + n + " premiers termes = " + somme);
	}

	/* Exercice 8 */
	public static int occurrence(int[] tab, int n) {
		int derniere = -1;

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == n)
				derniere = i;
		}

		return derniere;
	}

}
