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
			try {
				getClientList();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
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
		}
	}

	public static void getAccountList() {

	}

	public static void displayCreditCardList() {

	}

	public static void makeWithdraw() {

	}

	public static void researchClient() {

	}

	public static void addClient() throws SQLException {
		System.out.println("Prénom du client ? ");
		clavier.nextLine();
		String prenom = clavier.nextLine();

		System.out.println("Ville du client ? ");
		String ville = clavier.nextLine();

		System.out.println("Âge du client ? (0 pour annuler la création)");
		int age = clavier.nextInt();

		PreparedStatement statement = connexionBanque.prepareStatement("INSERT INTO client(prenom, age, ville) VALUES(?,?,?);");
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

	public static void removeClient() {

	}

	public static void removeAccount() {

	}

	public static void removeCreditCard() {
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
