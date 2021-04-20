import java.util.Scanner;

public class ExtractingDigits 
{
	public static void main(String[] args) 
	{
		// Get the scanner to get input from the user	
		Scanner kb = new Scanner(System.in);
		
		// Prompt the user and get their input from the keyboard
		//  Discussion: What other options are there for different data types that can be input?
		//  Discussion: What happens if you do not enter numbers?		
		//  Discussion: What happens if you try to store the input into a variable that is the wrong type?		
		System.out.print("Enter a 5 digit integer:  ");
		int inputVal = kb.nextInt();
		
		// Calculate each digit
		//  Discussion: What do the % and / operators do?
		//  Discussion: What other operators are available in Java?
		int ones = inputVal % 10;
		int tens = inputVal % 100 / 10;
		int hundreds = inputVal % 1000 / 100;
		int thousands = inputVal % 10000 / 1000;
		int h_thousands = inputVal / 10000;
		
		// Calculate sum
		int sum = ones + tens + hundreds + thousands + h_thousands;
		
		// Output result to the console
		//  Discussion: What does the %d format specify do?
		//  Discussion: What other format specify are available in printf()?
		System.out.printf("The sum of the digits is %d + %d + %d + %d + %d = %d\n", h_thousands, thousands, hundreds, tens, ones, sum);

		// Cleanup
		//  Discussion: What happens if I do not call close on the scanner?
		kb.close();
	}
}
