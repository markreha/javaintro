package app;

import java.util.Arrays;
import java.util.Collections;

import objects.Person;
import objects.Song;

// Discussion: Notice how I separated my main App code from other Objects code using packages. You will need imports in THIS Class to the other Classes in the other package. Why is this a good idea?
// 		Class Action Items: 
//				1. Right click on the src folder in your project.
//				2. Select the Create Class menu option. 
//				3. Enter the Package name. 
//				4. Enter the Class name. Select the create main() if desired.
// Discussion: After we code the following up how could the design of our Program be improved?
public class App 
{
	// Our Programs Objects that has a person that can play music
	private Person person;
	private Song[] songs;
	
	// Our Programs entry point
	public static void main(String[] args) 
	{	
		// Create an instance of this App (our Program)
		App app = new App();
		
		// Create a Person to play some Songs
		app.person = new Person("Mark", 60);
		
		// Create some Songs
		app.songs = new Song[5];
		app.songs[0] = new Song("The Beatles", "Here Comes the Sun");
		app.songs[1] = new Song("The Beatles", "Hey Jude");
		app.songs[2] = new Song("The Beatles", "Come Together");
		app.songs[3] = new Song("The Beatles", "Get Back");
		app.songs[4] = new Song("The Beatles", "A Day in the Life");
		
		// Let's see which Person is playing a Song
		app.person.talk();
		
		// Let's play the 3rd Song
		app.songs[2].play();
		
		// Let's Shuffle the Songs
		//  Class Action Item: Google 'Oracle Java Collections' and look at how the shuffle() can be called
		//  Class Action Item: Google 'Oracle Java Arrays' and look at how the asList() can be called
		Collections.shuffle(Arrays.asList(app.songs));
			
		// Let's play the 3rd Song after the Songs have been shuffled
		app.songs[2].play();
	}
}


