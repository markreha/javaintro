/**
 * This represents the attributes and behavior of a Person.
 * 
 * @author markreha
 *
 */
public class Person 
{
	// Our private attributes	
	private String name;
	private int age;
	private float weight;

	/**
	 * Non-Default Constructor for a Person.
	 * 
	 * @param age Persons age
	 * @param name Persons name
	 * @param weight Persons weight
	 */
	public Person(int age, String name, float weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	/**
	 * Return the Persons name.
	 * 
	 * @return The persons name.
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Return the Persons age.
	 * 
	 * @return The persons age.
	 */
	public int getAge()
	{
		return this.age;
	}
	
	
	/**
	 * Return the Persons weight.
	 * 
	 * @return The persons weight.
	 */
	public float getWeight()
	{
		return this.weight;
	}
	
	// ***** Our public Behaviors *****
	
	/**
	 * A walk behavior.
	 * 
	 */
	public void walk()
	{
		System.out.printf("I am in walk()");
	}
	
	/**
	 * A run behavior.
	 * 
	 * @param distance Distance to run.
	 * @return Distance ran.
	 */
	public float run(float distance)
	{
		System.out.printf("I am in run()");
		return distance - 1;
	}	
	
	/**
	 * This is the main entry point of the application.
	 * 
	 * @param args Passed in arguments to application.
	 */
	public static void main(String[] args) 
	{
		Person person = new Person(40, "Bob", 165);
		String name = person.getName();
		System.out.println("My name is " + name);
		person.walk();
		person.run(1);		
	}
}


