package banque;

import java.util.Scanner;

public class Main {
	static final String NOM_BANQUE = "Banque Simplon";

	static String[] tableOptions = { "", "Liste des clients", "Liste des comptes", "Liste des cartes",
			"Effectuer un virement", "Rechercher un client", "Ajouter un client", "Ajouter un compte",
			"Ajouter une carte", "Supprimer un client", "Supprimer un compte", "Supprimer une carte", "Quitter" };

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

	public static void getClientList() {

	}

	public static void getAccountList() {

	}

	public static void displayCreditCardList() {

	}

	public static void makeWithdraw() {

	}

	public static void researchClient() {

	}

	public static void addClient() {

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
		if (texte.equals("y") || texte.equals("yes")) {
			System.out.println("Aurevoir ! Hâte de vous revoir à " + NOM_BANQUE);
			System.exit(0);
		} else
			return;
	}
	
	
}
