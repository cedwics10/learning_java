package hello;

public class HelloWorld {
	private boolean isStringNotEmpty, isHelloNumberPositive, helloNumberNotExists;

	private int intAge;

	private String stringDefault, stringFirstname, stringHelloNumber;

	private boolean ageDoesNotExists;

	public HelloWorld(String individualName) {
		this.stringFirstname = individualName;
		this.intAge = -1;
	}

	public HelloWorld(String individualName, int ageIndividual) {
		this.stringFirstname = individualName;
		
		this.ageDoesNotExists = ageIndividual == 0; // Artificial condition
		this.intAge = ageIndividual;

	}

	public void checkNumberExists() {
		if (this.ageDoesNotExists) {
			System.out.print("Vous n'avez pas indiqué votre âge : aurevoir.");
			System.exit(0);
		} else
			System.out.println("La classe Hello World est intanciée !\n");
	}

	public String printHelloMessage() {
		this.isStringNotEmpty = !this.stringFirstname.isEmpty();
		this.isHelloNumberPositive = this.intAge >= 0;
		this.helloNumberNotExists = false;


		if (this.isHelloNumberPositive)
			return "Hello "  + this.stringFirstname + ". Tu as " + this.intAge + " ans.";
		else if (this.isStringNotEmpty)
			return "Hello "  + this.stringFirstname + ". Je ne connais pas ton âge.";
		else
			return "Hello World !";
	}
}
