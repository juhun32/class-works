package ArrayProject;

import java.util.Scanner;

public class ArrayProgram1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] tempArray;
		
		System.out.print("How many days would you like to track the temperature of?: ");
		
		int numberOfDays = sc.nextInt();
		
		if(numberOfDays > 0) {
			tempArray = new double[numberOfDays];
		}
		else {
			tempArray = new double[5];
		}

		for(int i = 0; i < numberOfDays; i++) {
			System.out.print("What is the temperature for day " + (i + 1) + "?: ");
			double temp = sc.nextDouble();
			tempArray[i] = temp;
		}
		
		double sum = 0;
		for(int i = 0; i < tempArray.length; i++) {
			sum += tempArray[i];
		}
		
		double sumResult = sum / tempArray.length;
		System.out.println("average temperature: " + sumResult);
		
		double maxTemp = 0;
		for(int i = 0; i < tempArray.length; i++) {
			if(maxTemp < tempArray[i]) {
				maxTemp = tempArray[i];
			}
		}
		System.out.println("highest temperature: " + maxTemp);
	}

}
