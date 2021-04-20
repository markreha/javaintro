
public class Methods 
{
	// TODO: Don't forget to document me!
	public static void myFistMethod()
	{
		System.out.println("Hello this is my first method");
	}
	
	// TODO: Don't forget to document me!
	public static void mySecondMethod(String name)
	{
		System.out.printf("Hello %s this is my second method\n", name);
	}

	// TODO: Don't forget to document me!
	public static void sum(int i1, int i2) 
	{ 
		int result = 0;
		for (int i=i1;i <= i2;++i)
		{
			result = result + i;
		}
		System.out.printf("Sum from %d to %d is %d", i1, i2, result);	
	}
	
	// TODO: Don't forget to document me!
	public void sayHello()
	{
		System.out.println("Hello my name is Mark");
	}
	
	// TODO: Don't forget to document me!
	public int addNumbers(int a, int b)
	{
		return a + b;
	}

	public static void main(String[] args)
	{
		// Perform some calculations with a repeated algorithm
		int sum = 0;
		for (int i=1;i <= 10;++i)
		{
			sum = sum + i;
		}
		System.out.println("Sum from 1 to 10 is " + sum);
		sum = 0;
		for (int i=20;i <= 37;++i)
		{
			sum = sum + i;
		}
		System.out.println("Sum from 20 to 37 is " + sum);
				
		// Call some of our first methods in a static way
		myFistMethod();
		mySecondMethod("Mark");
		mySecondMethod("Mary");
		
		// Let's improve the above algorithm by using methods
		//   Discussion: How did using methods like sum() improve our code?
		//   Discussion: How could I improve the implementation of sum()?
		//   Discussion: What does the acronym DRY stand for?
		sum(1, 10);
		sum(20, 37);
		
		// Call a method in a non static way by creating a Method object (notice this is an instance of ourself) 
		Methods object = new Methods();
		
		// Say Hello
		object.sayHello();
		
		// Add some Numbers
		int result = object.addNumbers(1, 2);
		System.out.printf("The result is %d\n", result);
		result = object.addNumbers(10, 20);
		System.out.printf("The result is %d\n", result);
	}
}
