package App;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo {
	static final String NOM_BANQUE = "Banque Simplon";

	static String[] tableOptions = { "", "Liste des clients", "Liste des comptes", "Liste des cartes",
			"Effectuer un virement", "Rechercher un client", "Ajouter un client", "Ajouter un compte",
			"Ajouter une carte", "Supprimer un client", "Supprimer un compte", "Supprimer une carte", "Quitter" };

	static ArrayList<Integer> client_id = new ArrayList<>();
	static ArrayList<String> client_prenom = new ArrayList<>();
	static ArrayList<String> client_nom = new ArrayList<>();
	static ArrayList<String> client_ville = new ArrayList<>();
	static ArrayList<Integer> client_age = new ArrayList<>();

	static ArrayList<Integer> compte_id = new ArrayList<>();
	static ArrayList<String> compte_rib = new ArrayList<>();
	static ArrayList<Double> compte_solde = new ArrayList<>();
	static ArrayList<Integer> compte_client_id = new ArrayList<>();

	static ArrayList<Integer> carte_id = new ArrayList<>();
	static ArrayList<String> carte_numero = new ArrayList<>();
	static ArrayList<Integer> carte_a_exp = new ArrayList<>();
	static ArrayList<Integer> carte_id_compte = new ArrayList<>();

	static final int QUITTER = 12;
	static int userChoice;

	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
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

	public static void proceedToChoice(int userChoice) {
		System.out.println("\n***** Option choisie : " + tableOptions[userChoice]);
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
			adDcreditCard();
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
		default:
			quitApp();
		}

		System.out.print("\n");
	}

	/* START - ACTION METHODS */
	public static void getClientList() {
		int clientsNumber = client_id.size();

		if (clientsNumber == 0) {
			System.out.println("> Aucun client n'est inscrit.");
			return;
		}

		for (int cli = 0; cli < clientsNumber; cli++) {
			displayClient(cli);
			// displayAccount(cli);
		}
	}

	public static void getAccountList() {
		int AccountsNumber = compte_id.size();

		if (AccountsNumber == 0) {
			System.out.println("> Aucun compte n'existe dans la banque.");
			return;
		}

		if (compte_id.isEmpty())
			return;

		for (int acc = 0; acc < AccountsNumber; acc++) {
			displayAccount(acc);
		}
	}

	public static void getAccountList(int idClient) {
		int AccountsNumber = compte_id.size();
		boolean noAccountExists = compte_client_id.indexOf(idClient) == -1;
		
		if (AccountsNumber == 0) {
			System.out.println("> Aucun client n'est inscrit.");
			return;
		}

		if (noAccountExists)
			return;
		
		for (int acc = 0; acc < AccountsNumber; acc++) {
			if (compte_client_id.get(acc) == idClient)
				displayAccount(acc);
		}
	}

	public static void displayCreditCardList() {
		int creditCardNumber = carte_id.size();

		if (creditCardNumber == 0) {
			System.out.println(">>> Aucune carte de crédit n'existe pour le compte.");
			return;
		}

		for (int cli = 0; cli < creditCardNumber; cli++) {
			displayCreditCard(cli);
		}
	}

	public static void displayCreditCardList(int idAccount) {
		int creditCardNumber = carte_id.size();

		if (creditCardNumber == 0) {
			System.out.println(">>> Aucune carte de crédit n'existe pour le compte.");
			return;
		}

		for (int cli = 0; cli < creditCardNumber; cli++) {
			displayCreditCard(cli);
		}
	}

	public static void addClient() {
		System.out.println("Prénom du client ? ");
		clavier.nextLine();
		String prenom = clavier.nextLine();

		System.out.println("Nom du client ? ");
		String nom = clavier.nextLine();

		System.out.println("Ville du client ? ");
		String ville = clavier.nextLine();

		System.out.println("Âge du client ? (0 pour annuler la création)");
		int age = clavier.nextInt();

		insertClient(prenom, nom, ville, age);

		System.out.println("--------------------------");
		String message = (age > 0) ? "Client créé avec succès." : "Création du client annulée.";
		System.out.println(message);
	}

	public static void makeWithdraw() {
		System.out.println("Le retrait se fait sur quel individu ?");
		int idClient = clavier.nextInt();
		if (client_id.indexOf(idClient) == -1) {
			System.out.println("Le comtpe n'existe pas");
			return;
		}
		System.out.println("Quel compte ?");
		getAccountList(idClient);
		System.out.println("Quell montant ?");
		// which amount of money ?
	}

	public static void researchClient() {
	}

	public static void addAccount() {
		getClientList();
		System.out.println("Quel est le numéro du client :");
		int idClient = clavier.nextInt();
		if (clientNotExists(idClient)) {
			System.out.println("Ce client n'existe pas.");
			return;
		}

		System.out.println("Quel est le montant à déposer ?");
		double soldeDepart = clavier.nextDouble();
		int lastKey = (compte_id.size() > 0) ? compte_id.get(compte_id.size() - 1) : 0;
		compte_id.add(lastKey + 1);
		compte_solde.add(soldeDepart);
		compte_rib.add("FRXX XXXX XXXX XXXX XXXX");
		compte_client_id.add(idClient);
	}

	public static void adDcreditCard() {
		// Then : create a new card

		getClientList();

		System.out.println("Donnez le numéro du client :");
		int clientId = clavier.nextInt();
		if (clientNotExists(clientId)) {
			System.out.println("Ce client n'existe pas.");
			return;
		}

		getAccountList(clientId);

		System.out.println("Donnez le numéro de compte");
		int accountId = clavier.nextInt();
		
		System.out.println(compte_client_id);
		
		if (accountNotBelongsTo(accountId, clientId))
			System.out.println("Le client ne correspond pas au numéro de carte");

		insertCreditCard("4970 XXXX XXXX XXXX", 2027, clientId);

	}

	public static void removeClient() {
		System.out.println("Quel est le nuémro du client à supprimer ? (0 pour annuler)");
		int idClient = clavier.nextInt();
		if (idClient == 0)
			return;

		if (clientNotExists(idClient)) {
			System.out.println("Le client n'existe pas. Aucune suprpession n'aura lieu.");
			return;
		}
		deleteClient(idClient);
	}

	public static void removeAccount() {
		// check if the account is linked to a credit card
		System.out.println("Indiquer le nom du client du compt :");
		int idClient = clavier.nextInt();
		if (clientNotExists(idClient)) {
			System.out.println("Le client n'existe pas.");
			return;
		}

		int accountNumber = clavier.nextInt();
		deleteAccount(accountNumber);
	}

	public static void removeCreditCard() {
		// display all credit card
		// Scanner to choose the number of the card
		// no need to check anything, except the
		// existence of the key
		// simple remove
	}

	public static void quitApp() {
		System.out.println("Êets-vous sûr de vouloir quitter l'application ? (y/n)");
		String texte = clavier.next();
		if (texte.equals("y") || texte.equals("yes")) {
			System.out.println("Aurevoir ! Hâte de vous revoir à " + NOM_BANQUE);
			System.exit(0);
		} else
			return;
	}

	/* END - ACTION METHODS */

	/* START - INSERT METHODS */
	public static void insertAccount(String rib, double solde, int client_id) {
		compte_id.add(compte_id.size() + 1);
		compte_rib.add(rib);
		compte_solde.add(solde);
		compte_client_id.add(client_id);
	}

	public static void insertCreditCard(String number, int a_exp, int id_compte) {
		int idCard = (carte_id.size() > 0) ? carte_id.getLast() + 1 : 1;
		carte_id.add(idCard);
		carte_numero.add(number);
		carte_a_exp.add(a_exp);
		carte_id_compte.add(id_compte);
	}

	public static void insertClient(String prenom, String nom, String ville, int age) {
		if (age == 0)
			return;
		
		int lastId = (client_id.size() == 0) ? 0 : client_id.reversed().get(0);
		client_id.add(lastId + 1);
		client_prenom.add(prenom);
		client_nom.add(nom);
		client_age.add(age);
		client_ville.add(ville);
	}
	/* END - INSERT METHODS */

	/* START - VIEW METHODS */
	public static void getAccount(int idAccount) {
		int indexAccount = compte_id.indexOf(idAccount);
		if (indexAccount == -1)
			System.out.println("Recherche invalide.");

		System.out.println("Compte #" + idAccount + ", RIB : " + compte_rib.get(indexAccount) + ", Solde : "
				+ compte_solde.get(indexAccount));

	}

	public static void displayAccount(int accId) {
		System.out.print("- Compte #" + compte_id.get(accId) + ", ");
		System.out.println("RIB : " + compte_rib.get(accId) + ", ");
		System.out.print("Solde: " + compte_solde.get(accId) + ", ");
		System.out.println("Numéro client : " + compte_client_id.get(accId));
	}

	public static void displayClient(int cli) {
		System.out.print("[#" + client_id.get(cli) + "] ");
		System.out.println(client_nom.get(cli).toUpperCase() + " " + client_prenom.get(cli) + " - FICHE CLIENT");
		System.out.println("-> Ville : " + client_ville.get(cli));
		System.out.println("-> Âge : " + client_age.get(cli));
		System.out.println("-> Comptes :");
	}

	public static void displayCreditCard(int creditCardId) {
		System.out.print("[[[#" + carte_id.get(creditCardId) + "]]]");
		System.out
				.print(" " + carte_numero.get(creditCardId) + ", Expiration : " + carte_a_exp.get(creditCardId) + ",");
		System.out.println("Numéro compte : " + carte_id_compte.get(creditCardId));
	}
	/* END - VIEW METHODS */

	/* START - DELETE METHODS */
	public static void deleteAccount(int idAccount) {
		int cleClient = compte_id.indexOf(idAccount);

		compte_id.remove(cleClient);
		compte_rib.remove(cleClient);
		compte_solde.remove(cleClient);
		compte_client_id.remove(cleClient);
	}

	public static void deleteClient(int idClient) {
		int index = client_id.indexOf(idClient);
		client_id.remove(index);
		client_prenom.remove(index);
		client_nom.remove(index);
		client_ville.remove(index);
		client_age.remove(index);
	}

	public static void deleteCreditCard(int idCreditCard) {
		int creditCardKey = carte_id.indexOf(idCreditCard);

		carte_id.remove(creditCardKey);
		carte_numero.remove(creditCardKey);
		carte_a_exp.remove(creditCardKey);
		carte_id_compte.remove(creditCardKey);
	}

	/* END - DELETE METHODS */

	/* START - TESTS */
	public static boolean isClientExists(int idClient) {
		int clientId = client_id.indexOf(idClient);
		return (clientId == -1);
	}

	public static boolean clientNotExists(int idClient) {
		return client_id.indexOf(idClient) == -1;
	}

	public static boolean creditCardNotExists(int idCard) {
		return carte_id.indexOf(idCard) == -1;
	}

	public static boolean accountNotBelongsTo(int accId, int clientId) {
		int idIndexAccount = compte_id.indexOf(accId);
		return compte_client_id.indexOf(idIndexAccount) != clientId;
	}
	/* END - TESTS */
}
