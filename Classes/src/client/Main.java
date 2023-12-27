package client;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static ArrayList<Client> listeClients = new ArrayList<Client>();
	public static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choix = 0;

		do {
			showMenu();
			System.out.println("Tapez votre choix: ");
			choix = clavier.nextInt();
			switch (choix) {
			case 1:
				showClientList();
				break;
			case 2:
				addClient();
				break;
			case 3:
				removeClient();
				break;
			case 4:
				searchClient();
				break;
			case 5:
				editClient();
				break;
			}
		} while (choix != 6);
	}

	public static void showMenu() {
		System.out.println("------ MENU ------");
		System.out.println("1 - Liste des clients");
		System.out.println("2 - Ajouter un client");
		System.out.println("3 - Supprimer un client");
		System.out.println("4 - Rechercher un client");
		System.out.println("5 - Modifier un client");
		System.out.println("6 - Quitter");
		System.out.println("------------------");
	}

	public static void showClientList() {
		
		if(listeClients.size() == 0)
			System.out.println(">>> AUCUN CLINENT N'EST REFERNECÉ.");
		
		for (Client client : listeClients) {
			System.out.println(client);
		}
	}

	public static void addClient() {
		System.out.println("Quel est le prénom du client ?");
		clavier.nextLine();
		String prenom = clavier.nextLine();

		System.out.println("Quel est le nom du client ?");
		String nom = clavier.nextLine();

		System.out.println("Quelle est la ville du client ?");
		String ville = clavier.nextLine();

		System.out.println("Quel est le mail du client ?");
		String email = clavier.nextLine();

		Client nouveau = new Client(nom, prenom, ville, email);
		listeClients.add(nouveau);

	}

	public static void removeClient() {
		System.out.print("Donnez l'identifiant du client à supprimer :");
		
		int identifiant = clavier.nextInt();

		boolean supprime = false;
		for (int c = 0; c < listeClients.size(); c++) {
			if (listeClients.get(c).getId() == identifiant) {
				listeClients.remove(c);
				supprime = true;
			}
		}

		if (supprime)
			System.out.println("Le client a bien été supprimé");
		else
			System.out.println("Le clietn demandé n'existe pas.");

	}

	public static void searchClient() {
		System.out.println("Donnez un mot-clé pour la recherche du client désiré :");
		clavier.nextLine();
		String recherche = clavier.nextLine();
		recherche = recherche.toLowerCase();

		System.out.println("Les résultas correspondant à la recherche sont :");
		
		for (Client client : listeClients) {
			boolean matchPrenom = client.getPrenom().toLowerCase().contains(recherche);
			boolean matchNom = client.getNom().toLowerCase().contains(recherche);
			boolean matchVille = client.getVille().toLowerCase().contains(recherche);

			if (matchPrenom || matchNom || matchVille)
				System.out.println(client);
		}

	}

	public static void editClient() {
		System.out.println("Quel est le numéro du client ? ");
		int numero = clavier.nextInt();

		Client aEditer = new Client();
		int indexClient = -1;
		for (int c = 0; c < Main.listeClients.size(); c++) {
			if (Main.listeClients.get(c).getId() == numero) {
				aEditer = Main.listeClients.get(c);
				indexClient = c;
			}
		}

		if (indexClient == -1) {
			System.out.println("Le client à éditer n'a pas été trouvé");
			return;
		}

		System.out.println("Quel est le nouveau prénom du client ?");
		clavier.nextLine();
		String prenom = clavier.nextLine();

		System.out.println("Quel est le nouveau nom du client ?");
		String nom = clavier.nextLine();

		System.out.println("Quelle est la nouvelle ville du client ?");
		String ville = clavier.nextLine();

		System.out.println("Quel est le nouveau mail du client ?");
		String email = clavier.nextLine();

		aEditer.setNom(nom);
		aEditer.setPrenom(prenom);
		aEditer.setVille(ville);
		aEditer.setEmail(email);

		Main.listeClients.set(indexClient, aEditer);
	}

}
