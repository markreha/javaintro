import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PigLatin 
{
	public static void main(String[] args) 
	{
		try 
		{
			// User the Scanner to read a file as input
			Scanner fin = new Scanner(new File("sample.in"));
			
			// While there still are lines in the input file
			String input;
			while(fin.hasNext())
			{
				// Get a line of text from the file
				input = fin.next();
				
				// If the line is not blank
				if(input.length() > 0)
				{					
					// Convert the line of text to upper case
					String pigLatin = input.toUpperCase();
					
					// Move leading consonants to the end
					while(pigLatin.length() > 0 && 
							!pigLatin.startsWith("A") &&
							!pigLatin.startsWith("E") &&
							!pigLatin.startsWith("I") &&
							!pigLatin.startsWith("O") &&
							!pigLatin.startsWith("U") &&
							!pigLatin.startsWith("Y"))
					{
						// Extract the 
						pigLatin = pigLatin.substring(1) + pigLatin.charAt(0);
					}
					
					// Add "AY" to the end of the string
					pigLatin = pigLatin + "AY";
					
					// Display the original text and the new pig latin word to the output using a format
					System.out.printf("%-20s%-20s\n", input, pigLatin);									
				}
			}
			// Cleanup
			fin.close();			
		} 
		catch (FileNotFoundException e) 
		{
			// Display the file could not be opened
			System.out.println("File not found");
		}
		
	}
}
