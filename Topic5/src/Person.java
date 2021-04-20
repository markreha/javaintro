/**
 * A Person class with a couple of attributes and behaviors.
 * 
 * @author markreha
 *
 */
public class Person 
{
	// ***********************************
	//   LIST ALL YOUR ATTRIBUTES HERE
	// ***********************************
	
	// Discussion: You can put class member variables (i.e. data) inside your class too. Note, how I made these variables PRIVATE!
	private int age;
	private String name;

	// ***********************************
	//   LIST ALL YOUR CONSTRUCTORS HERE
	// ***********************************

	// Discussion: Declare default and non-default constructors as desired
	public Person()
	{
		this.age = -1;
		this.name = "Unknown";
	}
	
	// ***********************************
	//   LIST ALL YOUR BEHAVIORS HERE
	// ***********************************

	// Discussion: How could this class design be improved by using a non-default constructor?
	public void talk(String name, int age)
	{
		this.age = age;
		this.name = name;
		System.out.printf("Hello my name is %s and I am %d years old\n", name, age);
	}
	
	// Discussion: Eclipse will generate the Getter / Setter methods for you
	public String getName()
	{
		return this.name;
	}
	
	// Discussion: Do you need a Setter method? If not, why not?
	public int getAge()
	{
		return this.age;
	}

	// **********************************************
	// *********** For Testing Only *****************
	// **********************************************
	
	public static void main(String[] args)
	{
		// Instantiate a Person class using the new keyword
		Person person = new Person();
		
		// Make the Person talk by accessing its methods using the (dot) . operator
		person.talk("Mark", 60);
	}
}


