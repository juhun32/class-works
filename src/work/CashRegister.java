package work;

import java.util.Scanner;

public class CashRegister {
   public static void main (String [] args) {
      Scanner sc = new Scanner(System.in);
      double total = 0.00;
      
      System.out.print("price of the item?: $");
      double itemPrice = sc.nextDouble();
      
      
      while (itemPrice >= 0.00) {
         total += itemPrice;
         System.out.print("price of the item?: $");
         itemPrice = sc.nextDouble();
      }
      
      System.out.println("total: $" + total);
            
      sc.close();
   }
}