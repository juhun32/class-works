package ArrayProject;

//import java.util.Arrays;

public class Album {
	// instance variables
	private String artist;
	private String name;
	private String[] songNameArray;
	private int[] songTimeArray;
	private int numberOfSongs;
	private int runningTime;

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
		if (songTime > 0 && numberOfSongs < songNameArray.length) {
			songNameArray[numberOfSongs] = songName;
			songTimeArray[numberOfSongs] = songTime;
			runningTime += songTime;
			numberOfSongs++;
		}
	}

	public String getSongs() {
		String songs = "";
		for (int i = 0; i < numberOfSongs; i++) {
			songs = songs + "\n" + songNameArray[i];
		}
		// return Arrays.toString(songNameArray);
		return songs;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public String getAllSongInformation() {
		String allSongInformation = "";
		for (int i = 0; i < numberOfSongs; i++) {
			allSongInformation = allSongInformation + "\n" + "Name: " + songNameArray[i] + ", Time: " + songTimeArray[i] + " minutes";
		}
		return allSongInformation;
	}
}