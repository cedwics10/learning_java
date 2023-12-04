package hello;

public class HelloWorld {
	boolean isStringNotEmpty, isHelloNumberPositive, helloNumberNotExists;

	int intIndividualId;

	String stringDefault, stringHello, stringHelloNumber;

	boolean HelloNumberNotExists;
	
	public HelloWorld(String personalMessage) {
		
		this.HelloNumberNotExists = false; // Artificial condition
		this.stringDefault = "Hello World !";
		
		this.intIndividualId = 10;

		this.stringHello = "Tu es le num�ro : " + this.intIndividualId;

	}
	

	public HelloWorld(String personalMessage, int idIndividual) {
		
		this.HelloNumberNotExists = idIndividual == 0; // Artificial condition
		this.stringDefault = "Hello World !";
		
		this.intIndividualId = idIndividual;

		this.stringHello = "Tu es le num�ro : " + this.intIndividualId;

	}

	public void checkNumberExists() {
		if (this.HelloNumberNotExists) {
			System.out.print("Tu n'as pas de num�ro : aurevoir.");
			System.exit(0);
		} else
			System.out.println("La classe Hello World est intanci�e !\n");
	}

	public String printHelloMessage() {
		this.isStringNotEmpty = !this.stringHello.isEmpty();
		this.isHelloNumberPositive = this.intIndividualId >= 0;
		this.helloNumberNotExists = false;

		if (this.isStringNotEmpty)
			return this.stringDefault + " " + this.stringHello + " , " + this.stringHelloNumber;
		else if (this.isHelloNumberPositive)
			return "Le texte sp�cifi� est vide. " + this.stringHelloNumber;
		else
			return this.stringDefault + " Le texte sp�cifi� est vide. Pas de nombre.";
	}
}
