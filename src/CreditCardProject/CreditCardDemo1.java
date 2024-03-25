package CreditCardProject;



public class CreditCardDemo1 {
	public static void main(String[] args) {
		System.out.println("The credit limit for all credit card is: $" + CreditCard.getCreditLimit());
		CreditCard.increaseCreditLimit(700.00);
		System.out.println("The credit limit for all credit card is: $" + CreditCard.getCreditLimit());
		
		//CreditCard myCard = new CreditCard();
		//CreditCard yourCard = new CreditCard();
	}

}
