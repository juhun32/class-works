


public class Television {
	//instance variables
	private String brand;
	private boolean power;
	
	//first constructor
	public Television(String brand, int power) {
		this.brand = brand;
		if(power == 1) {
			this.power = true;
		}
		else {
			this.power = false;
		}
	}
	
	//default constructor
	public Television() {
		brand = ""; //this("",0); this would cause the call of the first constructor
		power = false;
	}
	
	public Television(String newBrand) {
		this(newBrand,1); //brand = newBrand;
						  //power = 1;
	}
	
	public Television(String newBrand, boolean newPower) {
		brand = newBrand;
		power = newPower;
	}
	
	public Television(int power) {
		this("No Brand",power);
		
		//brand = "No Brand;
		//if(power == 1) {
		//	this.power = power;
		//else {
		//	this.power = 0;
		//}
	}
		
	//non-static methods
	//setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPower(int power) {
		if(power == 0) {
			this.power = false;
		}
		else if(power == 1) {
			this.power = true;
		}
	}
	
	//overload setPower
	public void setPower(boolean power) {
		this.power = power;
	}
	
	//getters
	public String getBrand() {
		return brand;
	}
	
	public int getPower() {
		int powerAsInt; 
		if(power == false) {
			powerAsInt = 0;
		}
		else {
			powerAsInt = 1;
		}
		return powerAsInt;
	}
	
	//technically this isn't overloading, but it accomplishes the same goal
	public boolean getPowerAsBoolean() {
		return power;
	}
	
}
