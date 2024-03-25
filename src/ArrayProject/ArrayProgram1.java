package ArrayProject;

import java.util.Scanner;

public class ArrayProgram1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double [] tempArray; //reference to an array of doubles
		
		System.out.println("How many days would you like to track the temperature of?");
		int numberOfDays = keyboard.nextInt();
		
		if(numberOfDays > 0) {
			tempArray = new double[numberOfDays];
		}
		else {
			tempArray = new double[5];
		}
		
		//create a for loop to ask the user for the temperature of each day
		//save the user's input into a local variable
		//and then copy the value in that local variable to the the array
		for(int index = 0; index < tempArray.length; index++) {
			System.out.println("What is the temperature for day " + (index+1) + ":");
			double currentTemperature = keyboard.nextDouble(); //local variable
			tempArray[index] = currentTemperature;
		}
		//create a for loop to sum the values in the array 
		//calculate the average after the loop ends 
		//print the average to the screen  
		double sum = 0.0;
		for(int index = 0; index < tempArray.length; index++) {
			sum = sum + tempArray[index];
		}
		
		double average = sum / (double)tempArray.length; //explicit type casting 
		System.out.println("Average Temperature is: " + average);
		
		//create a for loop to find the highest temperature in the array
		//print the highest temperature after the loop ends
		double highestTemperature = tempArray[0];
		for(int index = 1; index < tempArray.length; index++) {
			if(tempArray[index] > highestTemperature) { //if you see a value higher 
				highestTemperature = tempArray[index]; //change it to that value
			}
		}
		
		System.out.println("Highest Temperature: " + highestTemperature);
		
		//create a for loop to find the lowest temperature in the array
		//print the lowest temperature after the loop ends
		double lowestTemperature = tempArray[0];
		for(int index = 1; index < tempArray.length; index++) {
			if(tempArray[index] < lowestTemperature) {
				lowestTemperature = tempArray[index];
			}
		}
		
		System.out.println("Lowest Temperature:"  + lowestTemperature);
		keyboard.close();
	}

}
