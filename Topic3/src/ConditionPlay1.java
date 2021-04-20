import java.util.Scanner;

public class ConditionPlay1
{
	public static void main(String[] args)
	{
		// Let's determine the Age Group for an Age specified by a user
		Scanner kb = new Scanner(System.in);
		System.out.print("Please specify an age to test: ");
		int age = kb.nextInt();
		
		// Compare all the Age Groups using an If statement
		if(age <= 1)
		{
			System.out.println("You are an infant");
		}
		if(age > 1 && age < 13)
		{
			System.out.println("You are a child");
		}
		if(age > 13 && age <= 17)
		{
			System.out.println("You are a teenager");
		}
		if(age > 17 && age < 65)
		{
			System.out.println("You are an adult");
		}
		if(age >= 65)
		{
			System.out.println("You are an older adult");
		}
		
		//  Discussion: What tests would I need to run to ensure ALL of my code is working?
		//  Discussion: How can I optimize this code so it runs faster?
		//  TODO: Let's code a more optimized algorithm!!
		//  Discussion: What other Java programming conditional construct can you use besides an If / Else If statement?
		//  TODO: Read your book for the answer!!
		//  TODO: Extra Practice: Write an algorithm that will display a users grade if the user is prompted for a number between 0 and 100
		//  TODO: Extra Practice: Write a program that uses a Switch Construct that displays the Day of the Week in Text given the Day Number

		// Cleanup by closing scanner (to avoid a warning in our code too)
		kb.close();
	}
}
