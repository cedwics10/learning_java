package hello;

public class HelloWorldBuilder {
	
	private String name;
	private int age;
	
	HelloWorldBuilder setName(String Name)
	{
		this.name = Name;
		return this;
	}
	
	HelloWorldBuilder setAge(int age)
	{
		if(age < 0)
		{
			System.out.println("Âge est invalide.");
			System.exit(0);
		}
		this.age = age;
		return this;
	}

	HelloWorld makeObject()
	{
		if(this.name != null && this.age != 0)
			return new HelloWorld(this.name, this.age);
		else
			return new HelloWorld(this.name);
	}
}
