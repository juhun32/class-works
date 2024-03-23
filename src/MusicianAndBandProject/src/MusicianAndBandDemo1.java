

public class MusicianAndBandDemo1 {
	public static void main(String[] args) {
		Musician alexLifeson = new Musician("Alex Lifeson", "Guitar");
		Musician geddyLee = new Musician("geddy Lee", "Bass");
		
		Band rush = new Band();
		rush.setName("Rush");
		rush.setMusician1(alexLifeson);
		rush.setMusician2(geddyLee);
		
		Musician neilPeart = new Musician("Neil Peart", "Drums");
		rush.setMusician3(neilPeart);
	}
}
