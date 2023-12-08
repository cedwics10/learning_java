package hello;

public class App {

	public static void main(String[] args) {
		HelloWorldBuilder myBuilder = new HelloWorldBuilder()
				.setName("G�rard")
				.setAge(40);
		
		HelloWorld myHello = myBuilder.makeObject();
		System.out.print(myHello.generateHelloMessage());
	}

}
