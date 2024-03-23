


public class CreditCard {
	//instance variables are properties, characteristics, or attributes
	//that are vary from object to object
	private String name;
	private double balance; 
	
	//static variables are the same for all instance or objects of a class.
	//static variables belong to the class itself as whole and not to the
	//objects of a class.
	private static double creditLimit = 500.00;
	
	//default constructor
	public CreditCard() {
		name = "";
		balance = 0.00;
	}
	
	//non-static methods
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	/*
	 * if price is greater than or equal to 0 and the price
	 * plus the balance is less than or equal to the creditLimit
	 * then add price to the balance and return true
	 * otherwise return false without changing the balance
	 */
	public boolean charge(double price) { //price is the parameter
		boolean accepted = false; //local variable
		if(price >= 0) {
			double newBalance = balance + price; //local variable
			if(newBalance <= creditLimit) {
				balance = newBalance;
				accepted = true;
			}
		}
		return accepted; 
	}
	
	/*
	 * if amount is greater than or equal to 0 and the amount
	 * is less than or equal to the balance then subtract the amount
	 * from the balance and return true otherwise return false
	 * without changing the balance 
	 */
	public boolean pay(double amount) {
		boolean paymentAccepted = false;
		if(amount >= 0 && amount <= balance) {
			balance = balance - amount;
			paymentAccepted = true;
		}
		return paymentAccepted;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//static methods
	public static boolean increaseCreditLimit(double newCreditLimit) {
		boolean increased = false;
		if(newCreditLimit > creditLimit) {
			creditLimit = newCreditLimit;
			increased = true;
		}
		return increased;
	}
	
	public static double getCreditLimit() {
		return creditLimit;
	}
	
	
}
