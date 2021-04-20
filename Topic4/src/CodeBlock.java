import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CodeBlock 
{
	public static void main(String[] args)
	{	
		try 
		{
			// Read the input file using the Scanner
			Scanner fin = new Scanner(new File("sample.in"));
			
						
			// Create a 6 * 7 char array (i.e. 6 Rows and 7 Columns)
			char [][] block = new char[6][7];
			
			// Read all text from the file
			String input = "";
			while(fin.hasNextLine())
			{
				// Add space to retain spacing at line breaks
				input += fin.nextLine() + " ";
			}
			
			// Make sure string is at least 42 chars and pad the rest with a *
			while(input.length() < 42)
			{
				input += "*";
			}
			
			// Show the input string
			System.out.println("Input string:\n" + input);
			
			// Fill the block array
			int strIndex = 0;
			for(int row = 0; row < block.length; ++row)
			{
				for(int col = 0; col < block[row].length; ++col)
				{
					block[row][col] = input.charAt(strIndex++);
				}
				++strIndex;
			}
			
			// Extract and build new string to produce an "encrypted" string
			String result = "";
			for(int col = 0; col < block[0].length; ++col)
			{
				for(int row = 0; row < block.length; ++row)
				{
					result = result + block[row][col];
				}
			}
			
			// Display the "encrypted" result
			System.out.println("Encrypted string:\n" + result);
			
			// Cleanup
			fin.close();
			
		} 
		catch (FileNotFoundException e) 
		{
			// Handle file not found exception
			System.out.println("File not found");
		}
	}
}
