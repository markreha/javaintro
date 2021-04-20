import java.util.Scanner;

public class ConditionPlay2
{
	public static void main(String[] args)
	{
		// Let's determine the Letter Grade for a grade value as specified by a user
		Scanner kb = new Scanner(System.in);
		System.out.print("Please your grade from 0 to 100: ");
		int number = kb.nextInt();
		
		// Check for valid grade range using an IF statement and a Logical Operator
		if(number < 0 || number > 100)
		{
			System.out.print("Invalid grade range");			
		}
		else
		{
			// Compare all the grade ranges
			//  Discussion: How could this code be improved so it is independent of the order of my If Else If statements?
			if(number <= 59)
			{
				System.out.println("You got an F");
			}
			else if(number <= 69)
			{
				System.out.println("You got a D");
			}
			else if(number <= 79)
			{
				System.out.println("You got a C");
			}
			else if(number <= 89)
			{
				System.out.println("You got a B");
			}
			else
			{
				System.out.println("You got an A");
			}
		}
		
		// Cleanup by closing scanner (to avoid a warning in our code too)
		kb.close();
	}
}
