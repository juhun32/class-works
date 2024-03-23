

import java.util.Scanner;

public class CreditCardDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CreditCard myCreditCard = new CreditCard();
		int option;
		
		do {
			System.out.println("Press 1 to change the name on the credit card");
			System.out.println("Press 2 to charge something to the credit card");
			System.out.println("Press 3 to pay the credit card");
			System.out.println("Press 4 to show all information about the credit card");
			System.out.println("Press 5 to end the program");
			option = sc.nextInt();
			
			if(option == 1) {
				System.out.print("set name: ");
				String set = sc.next();
				myCreditCard.setName(set);
				System.out.println("name changed to: " + myCreditCard.getName());
				System.out.println();
			}
			else if(option == 2) {
				System.out.print("amount?: $");
				double set = sc.nextDouble();
				if (myCreditCard.charge(set)) {
					System.out.print("charged amount: $" + set);
					System.out.println();
					System.out.print("balance: $" + myCreditCard.getBalance());
					System.out.println();
				} else {
					System.out.println("charge declined");
				}
				
			}
			else if(option == 3) {
				System.out.print("amount?: $");
				double set = sc.nextDouble();
				if (myCreditCard.pay(set) && set <= CreditCard.getCreditLimit()) {
					System.out.print("paid amount: $" + set);
					System.out.println();
					System.out.print("balance: $" + myCreditCard.getBalance());
					System.out.println();
				} else {
					System.out.println("payment declined");
				}
			}
			else if(option == 4) {
				System.out.print("name: " + myCreditCard.getName());
				System.out.println();
				System.out.print("balance: " + myCreditCard.getBalance());
				System.out.println();
				System.out.print("limit: " + CreditCard.getCreditLimit());
				System.out.println();
			}
			else if(option == 5) {
				break;
			}
			else {
				System.out.println("invalid input");
				System.out.println();
			}
			System.out.println();
		}while(option != 5);
		
		sc.close();
	}
}
