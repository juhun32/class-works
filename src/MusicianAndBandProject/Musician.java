package MusicianAndBandProject;




public class Musician {
	private String name;
	private String instruments;
	
	public Musician (String name, String instruments) {
		this.name = name;
		this.instruments = instruments;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setInstruments (String newInstruments) {
		instruments = newInstruments;
	}
	
	public String getInstruments() {
		return instruments;
	}
}
