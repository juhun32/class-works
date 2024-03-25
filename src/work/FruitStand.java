package work;

/*
Requirements Analysis (English Description)
Create a program that will allow a user to calculate
how much a customer owes for the fruits they are buying
at a fruit stand.  The user will be given the option to
buy apples, bananas, or mangoes.  Once the user picks one
of the fruits, they will be asked how many of that fruit
they would like to purchase.  The customer will then be charged
for that many fruits.  The program should end by displaying the
amount they owe for the fruits they are purchasing.  Apples cost
30 cents each.  Bananas cost 40 cents each.  Mangoes cost 50 cents
each.  The user can only pick one type fruit.  If the user picks
none of these, give the user an error message.  

Design (Algorithm)
1. show user the list of fruits
2. require user to choose one fruit
3. if user input == 1 (apple)
3-1. output cost of fruit
3-2. ask user for input; number of fruits
3-3. assign result = cost * number of fruits
4. if user input == 2 (banana)
4-1. output cost of fruit
4-2. ask user for input; number of fruits
4-3. assign result = cost * number of fruits
5. if user input == 3 (mango)
5-1. output cost of fruit
5-2. ask user for input; number of fruits
5-3. assign result = cost * number of fruits
6. output error message if input number is not 1, 2, 3
7. END
*/

import java.util.Scanner;

public class FruitStand {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		double owed = 0;
      
      do {
         System.out.println();
		   System.out.println("----------");
		   System.out.println("1. apples");
	   	System.out.println("2. bananas");
   		System.out.println("3. mangoes");
	   	System.out.println("----------");
	   	System.out.println();
	   	System.out.print("Select fruit: ");		
		
	   	int numFruit;
	   	int whatFruit = sc.nextInt();
   
	   	if (whatFruit == 1) {
		   	System.out.println("Apples cost $ 0.3 each");
		   	System.out.println("");
		   	System.out.print("How many fruits?: ");
		   	numFruit = sc.nextInt();
		   	final double cost = 0.3;
		   	double result = cost * numFruit;
		   	System.out.println("Owed: $ " + result);
            owed += result;
		   }

	   	else if (whatFruit == 2) {
		   	System.out.println("Bananas cost $ 0.4 each");
		   	System.out.println("");
		   	System.out.print("How many fruits?: ");
		   	numFruit = sc.nextInt();
		   	final double cost = 0.4;
		   	double result = cost * numFruit;
		   	System.out.println("Owed: $ " + result);
            owed += result;
		   }

	   	else if (whatFruit == 3) {
		   	System.out.println("Mangoes cost $ 0.5 each");
		   	System.out.println("");
		   	System.out.print("How many fruits?: ");
		   	numFruit = sc.nextInt();
		   	final double cost = 0.5;
		   	double result = cost * numFruit;
		   	System.out.println("Owed: $ " + result);
            owed += result;
		   }

		   else {
		   	System.out.println("Error");
            break;
	   	}
		} while (true);
      
      System.out.println();
      System.out.println("total owed: " + owed);
		sc.close();
	}
}