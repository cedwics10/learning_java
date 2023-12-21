package banque;

public class View {

	static private String[] tableOptions = { "", "Liste des clients", "Liste des comptes", "Liste des cartes",
			"Effectuer un virement", "Rechercher un client", "Ajouter un client", "Ajouter un compte",
			"Ajouter une carte", "Supprimer un client", "Supprimer un compte", "Supprimer une carte", "Quitter" };

	public static void afficherTitre(String titre) {
		System.out.println("===========================");
		System.out.println("Gestion de comptes : " + titre);
		System.out.println("===========================\n");
	}

	public static void menuPrincipal(String[] tableOptions) {
		System.out.println("--------------------------");
		System.out.println("Que souhaitez-vous faire ?");
		System.out.println("--------------------------");
		for (int i = 1; i < Banque.tableOptions.length; i++) {
			System.out.println(i + " : " + Banque.tableOptions[i]);
		}

		System.out.println("\n");
	}
}
