import java.util.Scanner;

// TODO First lets document our class!!!
public class OperatorPlay
{
	// TODO First lets document our main method!!!
	public static void main(String[] args)
	{
		// TODO First lets document our class and main method!!!
		// TODO Did you know if you put a TODO in a single line comment these can reviewed in Eclipse using the Tasks View??
		
		// Get the users age from the keyboard using the Scanner
		Scanner kb = new Scanner(System.in);
		System.out.print("What is your age in years?  ");
		int age = kb.nextInt();
		
		// Calculate the user age in months using the multiplier (*) operator
		//  We will first use a constant (and the final keyword and a variable) and then just straight up hard coded value
		//	    Discussion: Why would want to use a variable in your code?
		//	    Discussion: Why would want to use a constant in your code (also notice the all caps convention)?
		final int MONTHS_IN_YEAR = 12;
		System.out.printf("My age in months is %d\n", age * MONTHS_IN_YEAR);
		System.out.printf("My age again in months is %d\n", age * 12);

		// Let's look at operator precedence. Notice you will get 2 VERY different answers. When in doubt use parenthesis to group your calculations together.
		//	    Discussion: You need to read about operator precedence in your book! Also see the Tutorialspoint Java Tutorial at https://www.tutorialspoint.com/Java-Operators-Precedence.
		int number1 = 4 + 5 * 10;
		System.out.printf("Number 1 is %d\n", number1);
		int number2 = (4 + 5) * 10;
		int number3 = 4 + (5 * 10);
		System.out.printf("Number 1 is %d\n", number1);
		System.out.printf("Number 2 is %d\n", number2);
		System.out.printf("Number 3 is %d\n", number3);
		
		// Let's write an algorithm that calculates the number of $100, $20, $5, and $1 dollar bills for a bank withdraw
		//  We will use the divide (/) and the modulus remainder (%) operators in our calculations
		//	    Discussion: Do you remember doing this in one of your math classes? You can do take a similar approach for Programming Exercise #2 to calculate thousands, hundreds, ten, and ones for any decimal number.
		System.out.print("How much money in dollars to you want to withdraw?  ");
		int money = kb.nextInt();
		int hundreds = money / 100;
		System.out.printf("Number of hundred dollar bills is %d\n", hundreds);
		money = money % 100;
		int twenties = money / 20;
		System.out.printf("Number of twenty dollar bills is %d\n", twenties);
		money = money % 20;
		int fives = money / 5;
		System.out.printf("Number of five dollar bills is %d\n", fives);
		int ones = money % 5;
		System.out.printf("Number of one dollar bills is %d\n", ones);
		
		// Cleanup by closing scanner (to avoid a warning in our code too)
		kb.close();
	}
}
