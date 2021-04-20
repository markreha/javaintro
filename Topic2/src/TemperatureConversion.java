import java.util.Scanner;

/**
 * The Temperature Conversion program.
 * 
 * @author markreha
 *
 */
public class TemperatureConversion 
{
	/**
	 * The is the main entry point to the Temperature Conversion program.
	 * 
	 * @param args Command line arguments passed to the program.
	 */
	public static void main(String[] args) 
	{
		// Get the scanner to get input from the user
		Scanner kb = new Scanner(System.in);
		
		// Declare some variables for use in our program and to hold the calculation results
		double f_temp, c_temp;
		
		// Prompt the user and get their input from the keyboard
		System.out.print("Enter a Fahrenheit temperature: ");
		f_temp = kb.nextDouble();
		
		// Calculate Celsius
		c_temp = (f_temp - 32) * 5/9;
		
		// Output result to the console
		System.out.printf("%.2fF is equivalent to %.2fC.\n", f_temp, c_temp);	

		// Prompt the user and get their input from the keyboard
		System.out.println("Enter a Celsius temperature: ");
		c_temp = kb.nextDouble();
		
		// Calculate Fahrenheit
		f_temp = c_temp * 9/5 + 32;
		
		// Output result to the console
		System.out.printf("%.2fC is equivalent to %.2fF.\n", c_temp, f_temp);
		
		// Cleanup
		kb.close();
	}
}
