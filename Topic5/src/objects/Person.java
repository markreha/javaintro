package objects;

public class Person 
{
	// NOTE: Remember a class often has the following code (in order)
	//  Private Attributes (i.e. class member variables)
	//  Constructor (to initialize our Class)
	//  Getter and/or Setter methods (so we can access our Private Attributes)
	//  Behaviors (i.e. public class methods)

	// Our private attributes
	private String name;
	private int age;

	// Our Constructors and Getter / Setter methods
	// NOTE: You can get Eclipse to generate ALL of the following code but our talk method
	//			1. Right click on this source code pane
	//			2. Select the Source->Generate Constructor using Fields menu option
	//			3. Select the fields you want in your non-default Constructor
	//			4. Select where you want the code inserted
	//			5. Click the Generate button
	//
	//			1. Right click on this source code pane
	//			2. Select the Source->Generate Getter and Setters menu option
	//			3. Select the getter fields and setter fields you want generated 
	//			4. Select where you want the code inserted
	//			5. Click the Generate button
	public Person(String name, int age)
	{
		this.age = age;
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	// ***** Our public Behaviors *****
		
	public void talk()
	{
		System.out.printf("Hello my name is %s and I am %d years old\n", name, age);
	}	
}


