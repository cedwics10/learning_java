package App;

import java.util.Scanner;

public class Exo {
	static final int QUITTER = 12;
	static int userChoice;

	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		printWelcomeText();

		do {
			displayMenu();
			System.out.println("Tapez votre choix :");
			userChoice = clavier.nextInt();
			proceedToChoice(userChoice);
		} while (userChoice != QUITTER);
	}

	public static void printWelcomeText() {

	}

	public static void displayMenu() {

	}

	public static void proceedToChoice(int userChoice) {
		switch (userChoice) {
		case 1:
			getClientList();
		case 2:
			getAccountList();
		case 3:
			getCreditCardList();
		case 4:
			makeWithdraw();
		case 5:
			researchClient();
		case 6:
			addClient();
		case 7:
			addAccount();
		case 8:
			adDcreditCard();
		case 9:
			removeClient();
		case 10:
			removeAccount();
		case 11:
			removeCreditCard();
		case 12:
			quitApp();
		}
	}

	public static void getClientList() {
		// Select all
	}

	public static void getAccountList() {
		// Select all
	}

	public static void getCreditCardList() {
		// Select all
	}

	public static void makeWithdraw() {
// which credit card
		// which CVC ? 
		// which amount of money
	}

	public static void researchClient() {
		// what is the word to help looking for a certain client
	}

	public static void addClient() {
		// what the information of the client are ? 
	}

	public static void addAccount() {
		// for which client
	}

	public static void adDcreditCard() {
		// for which client
		// then : which account is concerned
	}

	public static void removeClient() {
		// check if client is linked to cosome credit car dand account
	}

	public static void removeAccount() {
// check if the account is linked to a credit card
	}

	public static void removeCreditCard() {
		// check if the credit card
	}

	public static void quitApp() {
		// Check if the individual wants to quit the app
	}
}
