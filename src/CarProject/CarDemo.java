/*
 * Create a program that asks a user for the information
 * for their favorite car.  The program should ask the user
 * for the make of their favorite car.  Then the program should
 * ask the user for the model of their favorite car.  Finally,
 * it should ask the user for the year of their favorite car.  
 * Then the program will create an object of the Car class 
 * and refer to this object as myFavoriteCar.  Then the values the
 * user entered should be saved into the Car object and those values
 * should then be printed to the screen.   
 */
package CarProject;

import java.util.*;

public class CarDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("favorite car brand?: ");
		String favBrand = sc.next();
		
		System.out.print("favorite car model?: ");
		String favModel = sc.next();
		
		System.out.print("favorite model year?: ");
		int favYear = sc.nextInt();
		
		Car myFavoriteCar = new Car();
		
		myFavoriteCar.setMake(favBrand);
		myFavoriteCar.setModel(favModel);
		myFavoriteCar.setYear(favYear);
		
		/*
		myFavoriteCar.brand = favBrand;
		myFavoriteCar.model = favModel;
		myFavoriteCar.year = favYear;
		*/
		
		// int result = myFavoriteCar.calculateAge(myFavoriteCar.year);
		int result = myFavoriteCar.calculateAge();
		
		/*
		System.out.println("favorite brand: " + myFavoriteCar.brand);
		System.out.println("favorite model: " + myFavoriteCar.model);
		System.out.println("favorite model year: " + myFavoriteCar.year);
		System.out.println("car's age: " + result);
		*/
		
		System.out.println("favorite brand: " + myFavoriteCar.getMake());
		System.out.println("favorite model: " + myFavoriteCar.getModel());
		System.out.println("favorite model year: " + myFavoriteCar.getYear());
		System.out.println("car's age: " + result);
		
		sc.close();
		
	}
}
