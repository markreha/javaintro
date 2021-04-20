import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PlayList
{
	public static void main(String[] args)
	{
		// Google Oracle Java Array to get all the documentation on this data structure
		// Create a List of Integers and add elements using add()
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.valueOf(10));
		integerList.add(Integer.valueOf(11));

		// Create a List of Strings and add elements using add()
		List<String> stringList = new ArrayList<String>();
		stringList.add("Hello World");
		stringList.add("Hi World");

		// Get first element from the List using get()
		System.out.printf("Integer Value %d\n", integerList.get(0));
		System.out.printf("String Value %s\n", stringList.get(0));

		// Loop over the List using a For Loop
		for (Integer data : integerList)
		{
			System.out.printf("Integer Value :%d\n", data);
		}

		// Loop over the List using an Iterator
		Iterator<String> stringIterator = stringList.iterator();
		while (stringIterator.hasNext())
		{
			System.out.printf("String Value %s\n", stringIterator.next());
		}
		
		// Read a list of Strings from a file and Loop over them to print them to the Console
		try
		{
			// Read all the Names from the File into an ArrayList of Strings
			String name;
			List<String> namesList = new ArrayList<String>();
			Scanner in = new Scanner(new File("names.txt"));
			while(in.hasNextLine())
			{
				name = in.nextLine();
				namesList.add(name);
			}
			stringIterator = namesList.iterator();
			while (stringIterator.hasNext())
			{
				System.out.printf("The name is %s\n", stringIterator.next());
			}
			
			// Cleanup
			in.close();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		// Create and display a list of Songs
		List<Song> songlist = new ArrayList<Song>();
		songlist.add(new Song("The Beatles", "Here Comes the Sun"));
		songlist.add(new Song("The Beatles", "Hey Jude"));
		songlist.add(new Song("The Beatles", "Come Together"));
		songlist.add(new Song("The Beatles", "Get Back"));
		songlist.add(new Song("The Beatles", "A Day in the Life"));
		for (Song song : songlist)
		{
			song.play();
		}
		
		// Remove and redisplay a list of Songs
		songlist.remove(0);
		for (Song song : songlist)
		{
			song.play();
		}
	}
}

