package HouseProject;

public class House {
	private String address;
	private Room room1;
	private Room room2;
	private Room room3;
	
	public House() {
		address = "";
		room1 = null;
		room2 = null;
		room3 = null;
	}
	
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setRoom1(String newName, int newSquareFeet) {
		Room newRoom1 = new Room();
		newRoom1.setName(newName);
		newRoom1.setSquareFeet(newSquareFeet);
		room1 = newRoom1;
	}
	
	public void setRoom2(String newName, int newSquareFeet) {
		Room newRoom2 = new Room();
		newRoom2.setName(newName);
		newRoom2.setSquareFeet(newSquareFeet);
		room2 = newRoom2;
	}
	
	public void setRoom3(String newName, int newSquareFeet) {
		Room newRoom3 = new Room();
		newRoom3.setName(newName);
		newRoom3.setSquareFeet(newSquareFeet);
		room3 = newRoom3;
	}
	
	public String getRoom1() {
		return "Name: " + room1.getName() + "\nSquare Feet: " + room1.getSquareFeet();
	}
	
	public String getRoom2() {
		return "Name: " + room2.getName() + "\nSquare Feet: " + room2.getSquareFeet();
	}
	
	public String getRoom3() {
		return "Name: " + room3.getName() + "\nSquare Feet: " + room3.getSquareFeet();
	}
	
	private class Room {
		private String name;
		private int squareFeet;
		
		public Room() {
			name = "";
			squareFeet = 0;
		}
		
		public void setName (String newName) {
			name = newName;
		}
		
		public String getName() {
			return name;
		}
		
		public void setSquareFeet(int newSquareFeet) {
			if(newSquareFeet > 50) {
				squareFeet = newSquareFeet;
			}
		}
		
		public int getSquareFeet() {
			return squareFeet;
		}
	}
}
