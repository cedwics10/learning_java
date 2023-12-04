package hello;

public class test {

	public static void main(String[] args) {
		HelloWorldBuilder myBuilder = new HelloWorldBuilder().setName("Mickey")
				.setAge(20);
		
		HelloWorld myHelloWorld = myBuilder.makeClass();
		myHelloWorld.checkNumberExists();
		System.out.print(myHelloWorld.printHelloMessage());
	} 
}
