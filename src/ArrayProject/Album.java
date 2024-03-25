package ArrayProject;

public class Album {
	// instance variables
	private String artist;
	private String name;
	private String[] songNameArray;
	private int[] songTimeArray;
	private int numberOfSongs;
	private int runningTime;
	private int index = 0;

	// constructor
	public Album() {
		artist = "";
		name = "";
		songNameArray = new String[20];
		songTimeArray = new int[20];
		runningTime = 0;
	}

	// constructor
	public void setArtist(String newArtist) {
		artist = newArtist;
	}

	public String getArtist() {
		return artist;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void addSongs(String songName, int songTime) {
		if (songTime > 0) {
			songNameArray[index] = songName;
			songTimeArray[index] = songTime;
			runningTime += songTime;
			index++;
		}
	}

	public String[] getSongs() {
		return songNameArray;
	}

	public int getRunningTime() {
		return runningTime;
	}
}
