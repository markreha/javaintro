public class Song 
{
	// Our private attributes
	private String artist;
	private String title;

	// Our constructor
	public Song(String artist, String title)
	{
		this.artist = artist;
		this.title = title;
	}
	
	// Our Getter methods	
	public String getArtist()
	{
		return artist;
	}

	public String getTitle()
	{
		return title;
	}

	// ***** Our public Behaviors *****
	
	public void play()
	{
		System.out.printf("I am playing song %s from artist %s\n", title, artist);
	}	
}


