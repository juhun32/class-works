package ArrayProject;

import java.util.Scanner;

public class TicketArrayProgram {
	public static void main(String[] args) {
		int[] ticketArray = createArray();
		getTicketsSold(ticketArray);
		int total = computeTotal(ticketArray);
		print(ticketArray, total);
	}

	public static int[] createArray() {
		Scanner keyboard = new Scanner(System.in);
		int numberOfDays; // delcaring a variable or bringing it into scope
		do {
			System.out.println("Enter the number of days to track ticket sales");
			numberOfDays = keyboard.nextInt();
			if (numberOfDays <= 0) {
				System.out.println("Error! Number of Days must be greater than 0! Try again!");
			}
		} while (numberOfDays <= 0);

		int[] temporaryArray = new int[numberOfDays];
		return temporaryArray;
	}

	/*
	 * getTicketsSold should ask the user for for the number of tickets
	 * sold for each day and save that input into a local variable
	 * and then place that value in the local variable into one of
	 * the elements in the array
	 */
	public static void getTicketsSold(int[] someArray) {
		Scanner keyboard = new Scanner(System.in);
		int tempNum;
		for (int i = 0; i < someArray.length; i++) {
			// do {
			System.out.println("The number of tickets sold for day " + (i + 1) + "?: ");
			tempNum = keyboard.nextInt();
			someArray[i] = tempNum;
			// } while (tempNum >= 0);
		}
	}

	/*
	 * Loop through the array to compute the total number
	 * of tickets sold. Once the loop ends, the method should
	 * return the total tickets
	 */
	public static int computeTotal(int[] ticketArray) {
		int sum = 0;
		for (int i = 0; i < ticketArray.length; i++) {
			sum += ticketArray[i];
		}
		return sum;
	}

	/*
	 * Loop through the array to print the number of tickets
	 * sold for each day and then print the total number of tickets
	 * sold.
	 */
	public static void print(int[] tArray, int total) {
		for (int i = 0; i < tArray.length; i++) {
			System.out.println("Tickets sold on day " + (i + 1) + ": " + tArray[i]);
		}
		System.out.println("Total Tickets sold: " + total);
	}
}
