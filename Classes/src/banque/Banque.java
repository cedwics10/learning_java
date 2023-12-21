package banque;

import java.util.ArrayList;
import java.util.Scanner;

import client.Client;

public class Banque {

	static Scanner clavier = new Scanner(System.in);
	static String[] tableOptions = { "", "Liste des clients", "Liste des comptes", "Liste des cartes",
			"Effectuer un virement", "Rechercher un client", "Ajouter un client", "Ajouter un compte",
			"Ajouter une carte", "Supprimer un client", "Supprimer un compte", "Supprimer une carte", "Quitter" };

	private static String nomBanque;
	private static ArrayList<Client> listeClients = new ArrayList<Client>();
	private static ArrayList<Compte> listeComptes = new ArrayList<Compte>();
	private static ArrayList<CarteBleue> listeCartesBleues = new ArrayList<CarteBleue>();

	public Banque() {
		this("Unkown");
	}

	public Banque(String nomBanque) {
		this.nomBanque = nomBanque;
		View.afficherTitre(nomBanque);
	}

	public void start() {
		int saisie = 1;
		do {
			View.menuPrincipal(Banque.tableOptions);
			saisie = clavier.nextInt();
			traiterSaisie(saisie);
		} while (saisie != 12);
	}

	public void traiterSaisie(int saisie) {
		switch (saisie) {
		case 1: // Liste des clients
			this.getClientList();
			break;
		case 2: // Liste des comptes
			this.getAccountList();
			break;
		case 3: // Liste des cartes bleues
			this.displayCreditCardList();
			break;
		case 4: // Faire un retrait
			this.makeWithdraw();
			break;
		case 5: // Rechercher un client
			this.researchClient();
			break;
		case 6: // Ajouter un client
			this.addClient();
			break;
		case 7: // Ajouter un compte
			this.addAccount();
			break;
		case 8: // Ajouter une carte de crédit
			this.adDcreditCard();
			break;
		case 9: // Remove a client
			this.removeClient();
			break;
		case 10: // Remove an account
			this.removeAccount();
			break;
		case 11: // Remove a credit card
			this.removeCreditCard();
			break;
		default:
			this.quitApp();
		}

	}

	public void getClientList() {
		if (listeClients.size() == 0) {
			System.out.println("Aucun client n'existe dans la liste\n");
			return;
		}

		for (Client client : listeClients) {
			System.out.println(client);
			getAccountList(client.getId());
		}

		System.out.print("\n");
	}

	public void getAccountList() {
		if (listeComptes.size() == 0) {
			System.out.println("Aucun client n'existe dans la liste\n");
			return;
		}

		for (Compte compteClient : listeComptes) {
			System.out.println(compteClient);
		}

		System.out.print("\n");
	}

	public void getAccountList(int idClient) {
		if (listeComptes.size() == 0) {
			System.out.println("Aucun compte n'existe dans la liste\n");
			return;
		}

		for (Compte compteClient : listeComptes) {
			if (compteClient.getIdCompte() == idClient)
				System.out.println(compteClient);
		}

		System.out.print("\n");
	}

	public void displayCreditCardList() {

	}

	public void makeWithdraw() {
		System.out.println("Sur quel compte retire-t-on de l'argent ?t");

		int compte1 = clavier.nextInt();
		if (getIndexAccount(compte1) == -1) {
			System.out.println("Ce compte n'existe pas.");
			return;
		}

		System.out.println("Vers quel compte est retiré l'argent ?");

		int compte2 = clavier.nextInt();
		if (getIndexAccount(compte2) == -1) {
			System.out.println("Ce compte n'existe pas");
			return;
		}
		
		System.out.println("Quel est le montant du prélèvement ?");
		int montant = clavier.nextInt();
		
		if()
	}

	public void researchClient() {
		System.out.println("Donnez un mot-clé pour la recherche du client désiré :");
		clavier.nextLine();
		String recherche = clavier.nextLine();
		recherche = recherche.toLowerCase();

		System.out.println("Les résultats correspondantS à la recherche sont :");

		for (Client client : listeClients) {
			boolean matchPrenom = client.getPrenom().toLowerCase().contains(recherche);
			boolean matchNom = client.getNom().toLowerCase().contains(recherche);
			boolean matchVille = client.getVille().toLowerCase().contains(recherche);

			if (matchPrenom || matchNom || matchVille)
				System.out.println(client);
		}
	}

	public void addClient() {
		System.out.println("Quel est le nom du client ? ");
		clavier.nextLine();
		String nom = clavier.nextLine();

		System.out.println("Quel est le prénom du client ? ");
		String prenom = clavier.nextLine();

		System.out.println("Quel est la ville du client ? ");
		String ville = clavier.nextLine();

		System.out.println("Quel est l'âge du client ? ");
		int age = clavier.nextInt();

		Client nouveauClient = new Client(nom, prenom, ville, age);
		listeClients.add(nouveauClient);
	}

	public void addAccount() {
		System.out.println("Quel est le numéro du client pour lequel nous créons un compte ?");
		int indexClient = -1;
		int choixIndex = clavier.nextInt();

		for (int c = 0; c < listeClients.size(); c++) {
			int allegedId = listeClients.get(c).getId();
			if (allegedId == choixIndex) {
				indexClient = allegedId;
				break;
			}
		}

		if (indexClient == -1) {
			System.out.println("Le client n'a pas été retrouvé");
			return;
		}

		System.out.println("Quel est le RIB du nouveau compte lcient ? ");
		clavier.nextLine();
		String rib = clavier.nextLine();

		System.out.println("Quel est le solde de départ du nouveau compte lcient ? ");
		double solde = clavier.nextDouble();

		Compte nouveauCompte = new Compte(rib, solde, indexClient);
		listeComptes.add(nouveauCompte);
	}

	public void adDcreditCard() {

	}

	public void removeClient() {
		System.out.println("Quel est le numéro du client à supprimer ?");
		clavier.nextLine();

		int indexSuppresson = -1;
		int choixIndex = clavier.nextInt();

		for (int c = 0; c < listeClients.size(); c++) {
			if (listeClients.get(c).getId() == choixIndex) {
				indexSuppresson = c;
				break;
			}
		}

		if (indexSuppresson == -1) {
			System.out.println("Le client numéro " + choixIndex + " n'a pas été retrouvé");
			return;
		}

		listeClients.remove(indexSuppresson);

		System.out.println("Le client a été supprimé.");

	}

	public void removeAccount() {

	}

	public void removeCreditCard() {

	}

	public void quitApp() {
	}

	/* DB methods */
	public static int getIndexAccount(int numeroCompte) {

		for (int c = 0; c < listeComptes.size(); c++) {
			int allegedId = listeComptes.get(c).getId();
			if (allegedId == numeroCompte) {
				return allegedId;
			}
		}

		return -1;
	}

}
