package ProgrammingTest;

import java.util.Scanner;

public class BookDemo {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Book myFavoriteBook = new Book();
		int option;
		
		do {
			System.out.println("Choose one of the following options: ");
			System.out.println("Press 1 to change the name of the book");
			System.out.println("Press 2 to change the number of pages in the book");
			System.out.println("Press 3 to change the current page");
			System.out.println("Press 4 to view all information about the book");
			System.out.println("Press 5 to end the program");
			
			option = keyboard.nextInt();
			
			if (option == 1) {
				System.out.println("What is the name of the book?: ");
				String newName = keyboard.next();
				myFavoriteBook.setName(newName);
			} 
			else if (option == 2) {
				System.out.println("What is the new number of pages in the book?: ");
				int newNumberOfPages = keyboard.nextInt();
				myFavoriteBook.setNumberOfPages(newNumberOfPages);
			} 
			else if (option == 3) {
				System.out.println("What is the new current page?: ");
				int newCurrentPage = keyboard.nextInt();
				myFavoriteBook.setCurrentPage(newCurrentPage);
			} 
			else if (option == 4) {
				System.out.println("The name of the book: " + myFavoriteBook.getname());
				System.out.println("The number of pages in the book: " + myFavoriteBook.getNumberOfPages());
				System.out.println("The current page of the book: " + myFavoriteBook.getCurrentPage());
			} 
			else if (option == 5) {
				System.out.println("Goodbye.");
			} 
			else {
				System.out.println("Error!");
			}
		} while(option != 5);
		
	}
}

