package banque;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	static final String NOM_BANQUE = "Banque Simplon";

	static String[] tableOptions = { "", "Liste des clients", "Liste des comptes", "Liste des cartes",
			"Effectuer un virement", "Rechercher un client", "Ajouter un client", "Ajouter un compte",
			"Ajouter une carte", "Supprimer un client", "Supprimer un compte", "Supprimer une carte", "Quitter" };

	static int userChoice;

	static Connection connexionBanque;

	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		Database.connect();
		connexionBanque = Database.connexion;

		printWelcomeText();

		while (true) {
			displayMenu();
			System.out.println("Tapez votre choix :");
			userChoice = clavier.nextInt();
			proceedToChoice(userChoice);
		}

	}

	public static void printWelcomeText() {
		System.out.println("===========================");
		System.out.println("Gestion de comptes : " + NOM_BANQUE);
		System.out.println("===========================\n");
	}

	public static void displayMenu() {
		System.out.println("--------------------------");
		System.out.println("Que souhaitez-vous faire ?");
		System.out.println("--------------------------");
		for (int i = 1; i < tableOptions.length; i++) {
			System.out.println(i + " : " + tableOptions[i]);
		}

		System.out.println("\n");
	}

	public static void proceedToChoice(int userChoice) throws SQLException {
		String optionChoisie = (userChoice < tableOptions.length) ? tableOptions[userChoice] : "Option invalide";
		System.out.println("\n***** Option choisie : " + optionChoisie);
		System.out.print("\n");

		switch (userChoice) {
		case 1: // Liste des clients
			getClientList();
			break;
		case 2: // Liste des comptes
			getAccountList();
			break;
		case 3: // Liste des cartes bleues
			displayCreditCardList();
			break;
		case 4: // Faire un retrait
			makeWithdraw();
			break;
		case 5: // Rechercher un client
			researchClient();
			break;
		case 6: // Ajouter un client
			addClient();
			break;
		case 7: // Ajouter un compte
			addAccount();
			break;
		case 8: // Ajouter une carte de crédit
			addcreditCard();
			break;
		case 9: // Remove a client
			removeClient();
			break;
		case 10: // Remove an account
			removeAccount();
			break;
		case 11: // Remove a credit card
			removeCreditCard();
			break;
		case 12:
			quitApp();
			break;
		default:
		}

		System.out.print("\n");
	}

	public static void getClientList() throws SQLException {
		Statement statement = connexionBanque.createStatement();
		ResultSet resultat = statement.executeQuery("SELECT id, prenom, age, ville FROM client");

		while (resultat.next()) {
			int id = resultat.getInt("id");
			int age = resultat.getInt("age");
			String prenom = resultat.getString("prenom");
			String ville = resultat.getString("ville");
			System.out.println("Client #" + id + " : " + prenom + " (Âge : " + age + "), ville : " + ville);
			getAccountList(id);
		}
	}s

	public static void getAccountList() throws SQLException {
		Statement statementompte = connexionBanque.createStatement();
		ResultSet resultatComptes = statementompte.executeQuery("SELECT * FROM compte");

		boolean noAccountForClient = !resultatComptes.next();
		if (noAccountForClient) {
			System.out.println("Aucun compt n'existe dans la banque.");
			return;
		}

		do {
			int numeroCompte = resultatComptes.getInt("id");
			System.out.println("--- Compte numéro : " + resultatComptes.getInt("id"));
			System.out.println("    *  RIB : " + resultatComptes.getString("rib"));
			System.out.println("    *  Solde : " + resultatComptes.getString("solde"));
			displayCreditCardList(numeroCompte);
		} while (resultatComptes.next());

	}

	public static void getAccountList(int numeroClient) throws SQLException {
		PreparedStatement statementompte = connexionBanque.prepareStatement("SELECT * FROM compte WHERE id_client = ?");
		statementompte.setInt(1, numeroClient);
		ResultSet resultatComptes = statementompte.executeQuery();

		boolean noAccountForClient = !resultatComptes.next();
		if (noAccountForClient) {
			System.out.println("Le client n'a pas de compte.");
			return;
		}

		do {
			int numeroCompte = resultatComptes.getInt("id");
			System.out.println("--- Compte numéro : " + numeroCompte);
			System.out.println("    *  RIB : " + resultatComptes.getString("rib"));
			System.out.println("    *  Solde : " + resultatComptes.getString("solde"));
			displayCreditCardList(numeroCompte);
		} while (resultatComptes.next());

	}

	public static void displayCreditCardList() throws SQLException {
		Statement statementompte = connexionBanque.createStatement();
		ResultSet resultatComptes = statementompte.executeQuery("SELECT * FROM carte");

		boolean noAccountretrieved = !resultatComptes.next();
		if (noAccountretrieved) {
			System.out.println("Aucun compt n'existe dans la banque.");
			return;
		}

		do {
			System.out.println("--- Carte numéro : " + resultatComptes.getInt("id"));
			System.out.println("      *  Numéro de carte : " + resultatComptes.getString("numero"));
		} while (resultatComptes.next());
	}

	public static void displayCreditCardList(int numeroCompte) throws SQLException {
		PreparedStatement statementompte = connexionBanque.prepareStatement("SELECT * FROM carte WHERE id_compte = ?");
		statementompte.setInt(1, numeroCompte);
		ResultSet resultatComptes = statementompte.executeQuery();

		boolean noAccountForClient = !resultatComptes.next();
		if (noAccountForClient) {
			System.out.println("--- Aucun compt n'existe pour le compte " + numeroCompte + ".");
			return;
		}

		do {
			System.out.println("      ** Carte numéro : " + resultatComptes.getInt("id"));
			System.out.println("        --  Numéro de carte : " + resultatComptes.getString("numero"));
		} while (resultatComptes.next());
	}

	public static void makeWithdraw() throws SQLException {
		System.out.println("Identifiant du compte débiteur :");
		clavier.nextLine();
		int numeroCompte1 = clavier.nextInt();

		System.out.println("Identifiant du compte créditeur :");
		int numeroCompte2 = clavier.nextInt();

		System.out.println("Montant à trasnférer");
		int montant = clavier.nextInt();

		PreparedStatement withdrawQuery = connexionBanque
				.prepareStatement("UPDATE compte SET solde = solde - ?" + " WHERE id = ? AND (solde - ?) >= 0");
		withdrawQuery.setInt(1, montant);
		withdrawQuery.setInt(2, numeroCompte1);
		withdrawQuery.setInt(3, montant);

		int affectedRows = withdrawQuery.executeUpdate();
		boolean noEnoughMoney = (affectedRows == 0);
		if (noEnoughMoney) {
			System.out.println(
					"Le virement ne peut pas être effectué\n" + "car 'utilisatuer n'a pas les fonds suffisants");
			return;
		}

		PreparedStatement depositQuery = connexionBanque
				.prepareStatement("UPDATE compte SET solde = solde + ?" + " WHERE id = ?");
		depositQuery.setInt(1, montant);
		depositQuery.setInt(2, numeroCompte2);

		depositQuery.executeUpdate();

		System.out.println("Le virement a bien été mis en place.");

	}

	public static void researchClient() throws SQLException {
		System.out.println("Terme de recherche du client : ");
		clavier.nextLine();
		String expression = clavier.nextLine();

		PreparedStatement statement = connexionBanque
				.prepareStatement("SELECT  * FROM client WHERE prenom LIKE ? OR ville LIKE ?");
		statement.setString(1, "%" + expression + "%");
		statement.setString(2, "%" + expression + "%");

		ResultSet resultatsRecherche = statement.executeQuery();

		boolean noResultFound = !resultatsRecherche.next();
		if (noResultFound) {
			System.out.println("Aucun résultat trouvé.");
			return;
		}

		System.out.println("Ensemble des résultats.");
		System.out.println("----------------------");

		do {
			System.out.println("Le client : " + resultatsRecherche.getString("prenom") + " ("
					+ resultatsRecherche.getString("ville") + ")");
			System.out.println("Il a : " + resultatsRecherche.getString("age") + " ans.\n");
		} while (resultatsRecherche.next());

	}

	public static void addClient() throws SQLException {
		System.out.println("Prénom du client ? ");
		clavier.nextLine();
		String prenom = clavier.nextLine();

		System.out.println("Ville du client ? ");
		String ville = clavier.nextLine();

		System.out.println("Âge du client ? (0 pour annuler la création)");
		int age = clavier.nextInt();

		PreparedStatement statement = connexionBanque
				.prepareStatement("INSERT INTO client(prenom, age, ville) VALUES(?,?,?);");
		statement.setString(1, prenom);
		statement.setInt(2, age);
		statement.setString(3, ville);
		statement.executeUpdate();

		System.out.println("Enregistrement réussi");
	}

	public static void addAccount() {

	}

	public static void addcreditCard() {

	}

	public static void removeClient() throws SQLException {
		Main.getClientList();
		System.out.println("Indiquer le numéro du client à supprimer :");
		int numeroClient = clavier.nextInt();

		PreparedStatement statementCompte = connexionBanque
				.prepareStatement("SELECT id, prenom, age, ville FROM client WHERE id = ?");
		statementCompte.setInt(1, numeroClient);
		ResultSet resultQueryClient = statementCompte.executeQuery();

		if (!resultQueryClient.next()) {
			System.out.println("Le client n'existe pas.");
			return;
		}

		PreparedStatement statementCarte = connexionBanque
				.prepareStatement("DELETE FROM carte WHERE id_compte IN(SELECT id FROM compte WHERE id_client = ?)");
		statementCarte.setInt(1, numeroClient);
		statementCarte.executeUpdate();

		statementCompte = connexionBanque.prepareStatement("DELETE FROM compte WHERE id_client = ?");
		statementCompte.setInt(1, numeroClient);
		statementCompte.executeUpdate();

		PreparedStatement statementClient = connexionBanque.prepareStatement("DELETE FROM client WHERE id = ?");
		statementClient.setInt(1, numeroClient);
		statementClient.executeUpdate();
		System.out.println("");
		System.out.println("Client " + numeroClient + " bien supprimé.");
	}

	public static void removeAccount() throws SQLException {
		System.out.println("Numéro du client :");
		int numeroClinet = clavier.nextInt();

		System.out.println("Quel est le montant de départ :");
		int montantDepart = clavier.nextInt();

		PreparedStatement createAccount = connexionBanque
				.prepareStatement("INSERT INTO compte(rib, solde, id_client) VALUES(?,?,?)");
		createAccount.setString(1, "3154321");
		createAccount.setInt(2, montantDepart);
		createAccount.setInt(3, numeroClinet);

		createAccount.executeUpdate();
	}

	public static void removeCreditCard() throws SQLException {

		displayCreditCardList();

		System.out.println("Quel est le numéro de la carte :");
		int numeroCarte = clavier.nextInt();

		PreparedStatement removeCard = connexionBanque.prepareStatement("DELETE FROM carte WHERE id = ?");
		removeCard.setInt(1, numeroCarte);
		int affectedRows = removeCard.executeUpdate();

		String text = (affectedRows == 1) ? "Carte supprimée." : "Aucune carte à supprimer.";

		System.out.println(text);

	}

	public static void quitApp() {
		System.out.println("Êets-vous sûr de vouloir quitter l'application ? (y/n)");
		String texte = clavier.next().toLowerCase();
		boolean userQuits = texte.equals("y") || texte.equals("yes");
		if (userQuits) {
			System.out.println("Aurevoir ! Hâte de vous revoir à " + NOM_BANQUE);
			System.exit(0);
		} else
			return;
	}

}
