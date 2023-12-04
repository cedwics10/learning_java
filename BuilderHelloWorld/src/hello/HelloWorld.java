package hello;

public class HelloWorld {
	private int intAge;

	private String stringFirstname;

	public HelloWorld(String individualName) {
		this.stringFirstname = individualName;
		this.intAge = -1;
	}

	public HelloWorld(String individualName, int ageIndividual) {
		this.stringFirstname = individualName;
		this.intAge = ageIndividual;
	}

	public String generateHelloMessage() {
		boolean nameIsNotEmpty = !this.stringFirstname.isEmpty();
		boolean ageIsValid = this.intAge >= 0;

		if (ageIsValid)
			return "Hello " + this.stringFirstname + ". Tu as " + this.intAge + " ans.";
		else if (nameIsNotEmpty)
			return "Hello " + this.stringFirstname + ". Je ne connais pas ton âge.";
		else
			return "Hello World !";
	}
}
