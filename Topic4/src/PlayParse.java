
public class PlayParse
{

	public static void main(String[] args)
	{
		// Extra: Parse a sentence into words and parse a word into characters
		// Google Oracle Java String to get all the documentation on the many methods available in the String class
		// Create a sentence with a bunch of words
		String sentence = "GCU is an awesome University";

		// Parse the sentence into individual words using the String.split()
		String delim = "[ ]+";
		String[] tokens = sentence.split(delim);
		
		// Print all the words out by looping over the token array
		for(int index=0;index < tokens.length;++index)
		{
			System.out.printf(" The word at position %d is %s\n", index, tokens[index]);
		}
		
		// Parse the 1st word of the sentence into characters
		for(int index=0;index < tokens[0].length();++index)
		{
			String token = tokens[0];
			System.out.printf(" The character at position %d is %c\n", index, token.charAt(index));
// OR can be shorted and optimized by not using a variable to hold the token string
//			System.out.printf(" The character at position %d is %c\n", index, tokens[0].charAt(index));
		}
	}

}
