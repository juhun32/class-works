package ArrayProject;

public class AlbumDemo {

	public static void main(String[] args) {
		Album holdYourFire = new Album();

		holdYourFire.setArtist("Rush");
		holdYourFire.setName("Hold Your Fire");
		holdYourFire.addSongs("Force Ten", 4);
		holdYourFire.addSongs("Time Stand Still", 5);

		System.out.println("Artist Name: " + holdYourFire.getArtist());
		System.out.println("Album Name: " + holdYourFire.getName());
		System.out.println("Songs: " + holdYourFire.getSongs());
		System.out.println("All Song Information: " + holdYourFire.getAllSongInformation());
		System.out.println("Running Time: " + holdYourFire.getRunningTime());
	}

}
