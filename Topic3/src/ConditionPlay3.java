import java.util.Scanner;

public class ConditionPlay3
{
	public static void main(String[] args)
	{
		// Extra Practice: Write a program that uses a Switch Construct that displays the Day of the Week in Text given the Day Number
		// Get the Numeric Day of the Week from the user
		Scanner kb = new Scanner(System.in);
		System.out.print("What number is the day of the week: ");
		int dow = kb.nextInt();

		// Check for valid Days of Week
		// Discussion: What is an alternative to coding the first If statement?
		// Discussion: When is a Switch statement not an appropriate choice for a decision construct?
		if (dow < 1 || dow > 7)
		{
			System.out.print("Invalid day of week specified");
		} 
		else
		{
			// Display Day of Week in text
			switch (dow)
			{
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
			}
		}

		// Cleanup by closing scanner (to avoid a warning in our code too)
		kb.close();
	}
}
