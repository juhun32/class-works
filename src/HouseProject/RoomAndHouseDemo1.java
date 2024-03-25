package HouseProject;

public class RoomAndHouseDemo1 {
	public static void main(String[] args) {
		House whiteHouse = new House();
		whiteHouse.setAddress("1600 Pennsylvania Avenue");
		whiteHouse.setRoom1("Briefing Room", 300);
		whiteHouse.setRoom2(null, 0);
		whiteHouse.setRoom3(null, 0);
		
		System.out.println(whiteHouse.getRoom1());
		System.out.println(whiteHouse.getRoom2());
		System.out.println(whiteHouse.getRoom3());
	}
}
