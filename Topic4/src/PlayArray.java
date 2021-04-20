
public class PlayArray
{

	public static void main(String[] args)
	{
		// Create a single dimensional array that hold Characters
		//  Discussion: What happens if I do not make the data type the same on each side of the assignment operator?
		char[] name = new char[10];
		
		// Initialize the array (option 1)
		//  Discussion: What happens if I do not make the array big enough?
		//  Discussion: Why did I have to put that null character in the last location of the array?
		name[0] = 'M';
		name[1] = 'a';
		name[2] = 'r';
		name[3] = 'k';
		name[4] = '\0';	
		
		// Create and initialize (option 2) a single dimensional array that hold numbers
		//  Discussion: How is option 2 to initialize an array easier and less error prone?
		int [] numbers = {6, 2, 3, 3, 3, 3, 0, 1, 2, 3};
		
		// Print each array
		//  Discussion: What happens if start my index at 1 rather than 0?
		for(int index=0;index < name.length;++index)
		{
			System.out.print(name[index]);
		}

		System.out.print(" phone number is ");
		for(int index=0;index < numbers.length;++index)
		{
			System.out.print(numbers[index]);			
		}
		System.out.print("\n");
		
		// Create a single dimensional array that hold Strings
		//  Discussion: What happens if I do not make the data type the same on each side of the assignment operator?
		String [] names = {"Mark", "Mary", "Justine", "Brianna"};
		
		// Loop over the names and print to the console
		for(int index=0;index < names.length;++index)
		{
			System.out.println(names[index]);
			
		}

		// TODO: Extra Practice: Create an array of numbers 0 thru 9, reverse the numbers of the array into a new array
		// TODO: Extra Practice: Parse a sentence into words and parse a word into characters
		// TODO: Extra Practice: Working with multidimensional arrays
	}

}
