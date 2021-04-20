import java.util.Scanner;

/**
 * Play Application - Learning Variables, Formatted Print, and Keyboard Input.
 * 
 * @author markreha
 *
 */
public class PrintfScannerPlay
{

	/**
	 * This is the entry point for the Play Application.
	 *   It is an exercise in learning formatted print, variables, and using the scanner.
	 *   
	 * @param args Arguments passed into the Application
	 */
	public static void main(String[] args)
	{
		// MAKE SURE TO COMMENT YOUR CODE INCLUDING CLASSES AND METHODS!!!
		// Use printlln() for hard coded output.
		System.out.printf("Hello my name is Mark and I am 60 years old\n");
		
		// Use printf() for a formatted output.
		//  %s is a placeholder for a String and %d is a placeholder for an integer number.
		//  Note that there is a special character \n that will print a carriage new line in the output.
		System.out.printf("Hello my name is %s and I am %d years old\n", "Mark", 60);

		// Declare a variable of type String with a name of name that can hold a string value and initialize it 
		// Declare a variable of type int with a name of age that can hold a number value and initialize it
		String name = "Mary";
		int age = 55;	

		// Print out the variables using printf() 
		System.out.printf("Hello my name is %s and I am %d years old\n", name, age);

		// Variables Syntax Discussions:
		//    Discussion: What happens if you get a data type wrong or spell it wrong?
		//    Discussion: What happens if you leave the assignment operator out?
		//    Discussion: What happens if you leave the semicolon out?
		//    Discussion: What happens if you assign a number variables type with a String?
		//    Discussion: What happens if you get a yellow warning that a variable is never used?

		// Let's get the input from the user
		//   Get the scanner to get input from the user	
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a persons name:  ");
		String newName = kb.next();
		
		System.out.print("Enter a persons age:  ");
		age = kb.nextInt();

		// Print out the users name and age using printf() 
		System.out.printf("Hello my name is %s and I am %d years old\n", newName, age);		

		// More Variables Discussions:
		//   Discussion: What happens if I try to declare a new variable with the same name?
		//   Discussion: Can you reuse a variable that was previously declared and used?
		//   Discussion: Why do I get a warning if the scanner was never closed?
		//   Discussion: How do I force my application to stop?
		//   Discussion what happens if you do not initialize a variable?

		// Some extra practice
		//  Discussion what is that f behind the floating point number?
		//  FYI: be careful because printf() will round floating point numbers and I have seen some weird things on Oracle JDK on OSX
		int hours = 11;
		int minutes = 0;
		System.out.printf("The time is %d:%02d\n", hours, minutes);
		float money = 1000000.35f;
		System.out.printf("My bank balance is %.2f\n", money);
		// You can print numbers out using a number of different approaches
		System.out.format("My new bank balance is %.2f\n", money);
		System.out.println(String.format("Another bank balance is %.2f", money));
		System.out.println("Yet another bank balance is " + money);
		System.out.println("Yet even another bank balance is " + Float.toString(money));
		
		// Cleanup by closing scanner (to avoid a warning in our code too)
		kb.close();
	}
}
