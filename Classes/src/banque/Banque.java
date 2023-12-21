package banque;

import java.util.ArrayList;
import java.util.Scanner;

public class Banque {
	
	static Scanner clavier = new Scanner(System.in);
	static String[] tableOptions = { "", "Liste des clients", "Liste des comptes", "Liste des cartes",
			"Effectuer un virement", "Rechercher un client", "Ajouter un client", "Ajouter un compte",
			"Ajouter une carte", "Supprimer un client", "Supprimer un compte", "Supprimer une carte", "Quitter" };

	private String nomBanque;
	private ArrayList<Client> listeClients = new ArrayList<Client>();


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
	
	public void getClientList()
	{
	}
	
	public void getAccountList()
	{
		
	}
	
	public void displayCreditCardList()
	{
		
	}
	
	public void makeWithdraw()
	{
		
	}
	
	public void researchClient()
	{
		
	}
	
	public void addClient()
	{
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
	
	public void addAccount()
	{
		
	}
	
	public void adDcreditCard()
	{
		
	}
	
	public void removeClient()
	{
		
	}
	
	public void removeAccount()
	{
		
	}
	
	public void removeCreditCard()
	{
		
	}
	
	public void quitApp()
	{
	}

}
