package CarProject;


public class Car {
	/*
	public String brand;
	public String model;
	public int year;
	*/
	
	//private instance variables are inaccessible outside of the class
	//that they are defined or declared or their scope is limited to this class
	
	private String brand;
	private String model;
	private int year;
	
	public Car() {
		brand = "";
		model = "";
		year = 2024;
	}
	
	/*
	public int calculateAge (int y) {
		return 2024 - y;
	}
	*/
	
	public int calculateAge () {
		return 2024 - year;
	}
	
	//setter methods or mutator methods which change the instance variables
	public void setMake(String newMake) {
		brand = newMake;
	}
	
	public void setModel(String newModel) {
		model = newModel;
	}
	
	public void setYear(int newYear) {
		if (newYear >= 1886 && newYear <= 2024) {
			year = newYear;
		}
	}
	
	//getter methods or accessor methods which access, 
	//but do not change the instance variables
	public String getMake() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
}
