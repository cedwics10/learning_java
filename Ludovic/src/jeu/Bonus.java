package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Bonus {

	static ArrayList<Integer> client_id = new ArrayList<>();
	static ArrayList<String> client_prenom = new ArrayList<>();
	static ArrayList<String> client_nom = new ArrayList<>();
	static ArrayList<String> client_ville = new ArrayList<>();
	static ArrayList<Integer> client_age = new ArrayList<>();

	static ArrayList<Integer> compte_id = new ArrayList<>();
	static ArrayList<String> compte_rib = new ArrayList<>();
	static ArrayList<Double> compte_solde = new ArrayList<>();
	static ArrayList<Integer> compte_id_client = new ArrayList<>();

	static ArrayList<Integer> carte_id = new ArrayList<>();
	static ArrayList<String> carte_num = new ArrayList<>();
	static ArrayList<Integer> carte_aExp = new ArrayList<>();
	static ArrayList<Integer> carte_id_compte = new ArrayList<>();

	static Scanner clavier = new Scanner(System.in);
	static int choix = 0;
	static int countClient = 0;
	static int countCompte = 0;
	static int countCarte = 0;

	public static void main(String[] args) {
		// BONUS
		while (choix >= 0 && choix <= 12) {
			choix = menu();
			if (choix == 0)
				menu();
			else if (choix == 1)
				clients();
			else if (choix == 2)
				comptes();
			else if (choix == 3)
				cartes();
			else if (choix == 4)
				virement();
			else if (choix == 5)
				surchClient();
			else if (choix == 6)
				addClient();
			else if (choix == 7)
				addCompte();
			else if (choix == 8)
				addCarte();
			else if (choix == 9)
				deleteClient();
			else if (choix == 10)
				deleteCompte();
			else if (choix == 11)
				deleteCarte();
			else if (choix >= 12 || choix < 0) {
				System.out.print("\nVous avez quiter l'application pour y rerentrer tappé 0 : ");
				choix = clavier.nextInt();
			}

		}

	}

	public static int menu() {
		System.out.println("----------MENU------------");
		System.out.println("1 -Liste des clients");
		System.out.println("2- Liste des comptes");
		System.out.println("3- Liste des cartes");
		System.out.println("4- Effectuer un virement");
		System.out.println("5- Rechercher un client");
		System.out.println("6 -Ajouter un client");
		System.out.println("7- Ajouter un compte");
		System.out.println("8- Ajouter une carte");
		System.out.println("9- Supprimer un client");
		System.out.println("10- Supprimer un compte");
		System.out.println("11-Supprimer une carte");
		System.out.println("12- Quitter");
		System.out.println("--------------------------");
		System.out.print("Que voulez vous faire? : ");
		return clavier.nextInt();
	}

	public static void clients() {
		System.out.println("\n\n--------------------------");
		System.out.println("# Liste de clients");
		for (int i = 0; i < countClient; i++) {
			System.out.println("Id : " + client_id.get(i) + " , Prénom : " + client_prenom.get(i) + " , Nom : "
					+ client_nom.get(i) + " , Ville : " + client_ville.get(i) + " , Age : " + client_age.get(i));
			for (int j = 0; j < countCompte; j++) {
				if (compte_id_client.contains(client_id.get(i))) {
					System.out.println("         #Id : " + compte_id.get(j) + " , RIB : " + compte_rib.get(j)
							+ " , Solde : " + compte_solde.get(j) + "€ , IdClient : " + compte_id_client.get(j));
					for (int k = 0; k < countCarte; k++) {
						if (carte_id_compte.contains(compte_id.get(j))) {
							System.out.println("                #Id : " + carte_id.get(k) + " , Num : "
									+ carte_num.get(k) + " , année expi : " + carte_aExp.get(k) + " , IdCompte : "
									+ carte_id_compte.get(k));
						}
					}
				}
			}
		}
		System.out.println("--------------------------");
	}

	public static void comptes() {
		System.out.println("\n\n--------------------------");
		System.out.println("# Liste des comptes : ");
		for (int j = 0; j < countCompte; j++) {
			System.out.println("#Id : " + compte_id.get(j) + " , RIB : " + compte_rib.get(j) + " , Solde : "
					+ compte_solde.get(j) + "€ , IdClient : " + compte_id_client.get(j));
			for (int k = 0; k < countCarte; k++) {
				if (carte_id_compte.contains(compte_id.get(j))) {
					System.out.println("        #Id : " + carte_id.get(k) + " , Num : " + carte_num.get(k)
							+ " , année expi : " + carte_aExp.get(k) + " , IdCompte : " + carte_id_compte.get(k));

				}
			}
		}

		System.out.println("--------------------------");
	}

	public static void cartes() {
		System.out.println("\n\n--------------------------");
		System.out.println("# Liste des cartes : ");
		for (int k = 0; k < countCarte; k++) {	
				System.out.println("#Id : " + carte_id.get(k) + " , Num : " + carte_num.get(k)+" , année expi : " + carte_aExp.get(k) + " , IdCompte : " + carte_id_compte.get(k));		
		}
		System.out.println("--------------------------");
	}

	public static void virement() {
		System.out.println("\n\n--------------------------");
		System.out.println("# Faire un virement: ");
		for (int i = 0; i < countCompte; i++) {
			System.out.println("Id : " + compte_id.get(i) + " , RIB : " + compte_rib.get(i) + " , Solde : "
					+ compte_solde.get(i) + " € , Id Client : " + compte_id_client.get(i));
		}
		System.out.println("------------------");
		System.out.println("Sur quel compte souhaitez vous faire un virrement? :");
		int comp1 = clavier.nextInt();
		int ind1 = compte_id.indexOf(comp1);
		Double sol1 = compte_solde.get(ind1);
		System.out.println("Quelle est le compte à débiter");
		int comp2 = clavier.nextInt();
		int ind2 = compte_id.indexOf(comp2);
		Double sol2 = compte_solde.get(ind2);
		System.out.println("Quel est le montant : ");
		Double mont = clavier.nextDouble();
		compte_solde.set(ind1, (sol1 + mont));
		compte_solde.set(ind2, (sol2 - mont));
		System.out.println("Le virement à bien été effectué");
		for (int i = 0; i < countCompte; i++) {
			System.out.println("Id : " + compte_id.get(i) + " , RIB : " + compte_rib.get(i) + " , Solde : "
					+ compte_solde.get(i) + " € , Id Client : " + compte_id_client.get(i));
		}
		System.out.println("--------------------------");
	}

	public static void surchClient() {
		System.out.println("\n\n--------------------------");
		System.out.println("# Rechercher un client : ");
		System.out.println("Donnez un mot clé (nom,prénom,ville) :");
		String mot=clavier.next();
		String surch = mot.toLowerCase();
		if(surch=="prénom") {
			System.out.println("Donne un prénom :");
			mot=clavier.next();
			if(client_prenom.contains(mot)) {
				int ind= client_prenom.indexOf(mot);
				System.out.println("Id : " + client_id.get(ind) + " , Prénom : " + client_prenom.get(ind) + " , Nom : "
						+ client_nom.get(ind) + " , Ville : " + client_ville.get(ind) + " , Age : " + client_age.get(ind));
				for (int j = 0; j < countCompte; j++) {
					if (compte_id_client.contains(client_id.get(ind))) {
						System.out.println("         #Id : " + compte_id.get(j) + " , RIB : " + compte_rib.get(j)
								+ " , Solde : " + compte_solde.get(j) + "€ , IdClient : " + compte_id_client.get(j));
						for (int k = 0; k < countCarte; k++) {
							if (carte_id_compte.contains(compte_id.get(j))) {
								System.out.println("                #Id : " + carte_id.get(k) + " , Num : "
										+ carte_num.get(k) + " , année expi : " + carte_aExp.get(k) + " , IdCompte : "
										+ carte_id_compte.get(k));
							}
						}
					}
				}
			}	else System.out.println("Ce prénom n'existe pas");
		}
		else if(surch=="nom") {
			System.out.println("Donne un nom :");
			mot=clavier.next();
			if(client_nom.contains(mot)) {
				int ind= client_nom.indexOf(mot);
				System.out.println("Id : " + client_id.get(ind) + " , Prénom : " + client_prenom.get(ind) + " , Nom : "
						+ client_nom.get(ind) + " , Ville : " + client_ville.get(ind) + " , Age : " + client_age.get(ind));
				for (int j = 0; j < countCompte; j++) {
					if (compte_id_client.contains(client_id.get(ind))) {
						System.out.println("         #Id : " + compte_id.get(j) + " , RIB : " + compte_rib.get(j)
								+ " , Solde : " + compte_solde.get(j) + "€ , IdClient : " + compte_id_client.get(j));
						for (int k = 0; k < countCarte; k++) {
							if (carte_id_compte.contains(compte_id.get(j))) {
								System.out.println("                #Id : " + carte_id.get(k) + " , Num : "
										+ carte_num.get(k) + " , année expi : " + carte_aExp.get(k) + " , IdCompte : "
										+ carte_id_compte.get(k));
							}
						}
					}
				}
			}else System.out.println("Ce nomb n'existe pas ");
		}
		else if(surch=="ville") {
			System.out.println("Donne une ville :");
			mot=clavier.next();
			if(client_ville.contains(mot)) {
				int ind= client_ville.indexOf(mot);
				System.out.println("Id : " + client_id.get(ind) + " , Prénom : " + client_prenom.get(ind) + " , Nom : "
						+ client_nom.get(ind) + " , Ville : " + client_ville.get(ind) + " , Age : " + client_age.get(ind));
				for (int j = 0; j < countCompte; j++) {
					if (compte_id_client.contains(client_id.get(ind))) {
						System.out.println("         #Id : " + compte_id.get(j) + " , RIB : " + compte_rib.get(j)
								+ " , Solde : " + compte_solde.get(j) + "€ , IdClient : " + compte_id_client.get(j));
						for (int k = 0; k < countCarte; k++) {
							if (carte_id_compte.contains(compte_id.get(j))) {
								System.out.println("                #Id : " + carte_id.get(k) + " , Num : "
										+ carte_num.get(k) + " , année expi : " + carte_aExp.get(k) + " , IdCompte : "
										+ carte_id_compte.get(k));
							}
						}
					}
				}
			}else System.out.println("Cette ville n'existe pas ");
		} else System.out.println("Ce mot n'existe pas");
		System.out.println("--------------------------");
	}

	public static void addClient() {
		countClient++;

		System.out.println("\n\n--------------------------");
		System.out.println("# Ajouter un client");
		client_id.add(countClient);
		System.out.println("Donne le prénom : ");
		client_prenom.add(clavier.next());
		System.out.println("Donne le nom : ");
		client_nom.add(clavier.next());
		System.out.println("Donne la ville : ");
		client_ville.add(clavier.next());
		System.out.println("Donne l'age : ");
		client_age.add(clavier.nextInt());
		System.out.println("--------------------------");
	}

	public static void addCompte() {
		countCompte++;

		System.out.println("\n\n--------------------------");
		System.out.println("# Ajouter un compte");
		compte_id.add(countCompte);
		System.out.println("Donne le n° RIB : ");
		compte_rib.add(clavier.next());
		System.out.println("Donne le solde du compte : ");
		compte_solde.add(clavier.nextDouble());
		System.out.println("Donne l'id du client : ");
		compte_id_client.add(clavier.nextInt());
		System.out.println("--------------------------");
	}

	public static void addCarte() {
		countCarte++;

		System.out.println("\n\n--------------------------");
		System.out.println("# Ajouter une carte");
		carte_id.add(countCarte);
		
		System.out.println("Donne le n° de la carte : ");
		carte_num.add(clavier.next());
		
		System.out.println("Donne l'année d'expiration : ");
		carte_aExp.add(clavier.nextInt());
		
		System.out.println("Donne l'id du compte lié : ");
		carte_id_compte.add(clavier.nextInt());
		
		System.out.println("--------------------------");
	}

	public static void deleteClient() {
		System.out.println("\n\n--------------------------");
		for (int i = 0; i < countClient; i++)
			System.out.println(
					"id : " + client_id.get(i) + " , Nom & Prénom : " + client_nom.get(i) + " " + client_prenom.get(i));
		System.out.println("Donnez l'id du client à supprimer");
		int idCli = clavier.nextInt();
		if (client_id.contains(idCli)) {
			System.out.println("!! ATTENtion !!");
			System.out.println(
					"Le client possècle des comptes et des cartes \nsi tu le supprimes les cartes et les comptes seront aussi supprimé \n pour continuer tappez : 1 \n pour annuler tappez : 0");
			int confirm = clavier.nextInt();
			if (confirm == 1) {
				while (compte_id_client.contains(idCli)) {
					int compte = compte_id_client.indexOf(idCli);
					int idComp = compte_id.get(compte);
					while (carte_id_compte.contains(idComp)) {

						int carte = carte_id_compte.indexOf(idComp);
						carte_id.remove(carte);
						carte_num.remove(carte);
						carte_aExp.remove(carte);
						carte_id_compte.remove(carte);
					countCarte--;
					}
					compte_id.remove(compte);
					compte_rib.remove(compte);
					compte_solde.remove(compte);
					compte_id_client.remove(compte);
					countCompte--;
				}
				int client = client_id.indexOf(idCli);
				client_id.remove(client);
				client_nom.remove(client);
				client_prenom.remove(client);
				client_ville.remove(client);
				client_age.remove(client);
				countClient--;
				System.out.println("La suppression à bien été effectué");
			} else
				System.out.println("La suppression à bien été annulé");
			System.out.println("--------------------------");
		} else {
			System.out.println("Id inconnu !");
			deleteClient();
		}
	}

	public static void deleteCompte() {
		System.out.println("\n\n--------------------------");
		for (int i = 0; i < countCompte; i++)
			System.out.println("id : " + compte_id.get(i) + " , RIB : " + compte_rib.get(i) + " , Solde : "
					+ compte_solde.get(i) + "€");
		System.out.println("Donnez l'id du compte à supprimer");
		int idComp = clavier.nextInt();
		if (compte_id.contains(idComp)) {
			System.out.println("!! ATTENtion !!");
			System.out.println(
					"Le compte peut possèder plusieurs cartes \nsi tu le supprimes les cartes seront aussi supprimé \n pour continuer tappez : 1 \n pour annuler tappez : 0");
			int confirm = clavier.nextInt();
			if (confirm == 1) {
				while (carte_id_compte.contains(idComp)) {
					int carte = carte_id_compte.indexOf(idComp);
					carte_id.remove(carte);
					carte_num.remove(carte);
					carte_aExp.remove(carte);
					carte_id_compte.remove(carte);
					countCarte--;
				}
				int compte = compte_id.indexOf(idComp);
				compte_id.remove(idComp);
				compte_rib.remove(compte);
				compte_solde.remove(compte);
				compte_id_client.remove(compte);
				countCompte--;
				System.out.println("La suppression à bien été supprimé");
			} else
				System.out.println("La suppression à bien été effectué");
			System.out.println("--------------------------");
		
		} else {
			System.out.println("Id inconnu !");
			deleteCompte();
		}
	}

	public static void deleteCarte() {
		System.out.println("\n\n--------------------------");
		for (int i = 0; i < countCarte; i++)
			System.out.println("id : " + compte_id.get(i) + " , RIB : " + compte_rib.get(i) + " , Solde : "
					+ compte_solde.get(i) + "€");
		
		System.out.println("Donnez l'id de la carte à supprimer");
		int idCarte = clavier.nextInt();
		if (carte_id.contains(idCarte)) {
					int carte = carte_id.indexOf(idCarte);
					carte_id.remove(carte);
					carte_num.remove(carte);
					carte_aExp.remove(carte);
					carte_id_compte.remove(carte);
				countCarte--;
				System.out.println("La suppression à bien été effectué");
			System.out.println("--------------------------");
		} else {
			System.out.println("Id inconnu !");
			deleteCarte();
		}
	}

}
