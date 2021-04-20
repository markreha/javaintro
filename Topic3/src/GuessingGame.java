import java.util.Random;
import java.util.Scanner;

public class GuessingGame 
{
	public static void main(String[] args) 
	{
		// Create a random integer between 1 and 10000, inclusive
		Random rnd = new Random();
		int randomNum = rnd.nextInt(10000) + 1;
		
		// Create a Scanner to get input from the user
		Scanner kb = new Scanner(System.in);
		
		// Calculate and set the low and high end of active range
		int lowEnd = 1;
		int highEnd = 10000;
		
		// Get a guess from the user
		System.out.printf("Guess a number between %d and %d:  ", lowEnd, highEnd);
		int guess = kb.nextInt();

		// Loop until the user has guessed the random number
		while(guess != randomNum)
		{			
			// If guess is too high, reset the high end of the range, and tell the user the number must be lower
			// Else reset the low end of the range and tell the user the number must be higher
			if(guess > randomNum)
			{
				// Reset the high end of range and inform the user
				highEnd = guess-1;
				System.out.printf("LOWER!\n");
			}
			else
			{
				// Reset the low end of range and inform the user
				lowEnd = guess + 1;
				System.out.print("HIGHER!\n");
			}
			
			// Prompt the user and get another guess
			System.out.printf("Guess a number between %d and %d:  ", lowEnd, highEnd);
			guess = kb.nextInt();
		}

		// Tell the user they won and cleanup
		System.out.println("WINNER!  The random number is " + randomNum);		
		kb.close();
	}
}
