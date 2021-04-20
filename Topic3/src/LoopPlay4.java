import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LoopPlay4
{
	public static void main(String[] args)
	{
		// Read a list of names from a file and Loop over them to print them to the Console
		try
		{
			// Read all the Names from the File
			String name;
			Scanner in = new Scanner(new File("names.txt"));
			while(in.hasNextLine())
			{
				// Read next name from the File and then print it to the console
				name = in.nextLine();
				System.out.printf("The name is %s\n", name);
			}
			
			// Cleanup
			in.close();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
