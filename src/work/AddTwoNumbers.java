package work;

import java.util.Scanner;

public class AddTwoNumbers {
   public static Scanner sc = new Scanner(System.in);

   public static void main (String [] args) {
      int num1 = getNumber();
      int num2 = getNumber();
      int result = addNumber(num1, num2);
      printNumber(result);
   }
      
   public static int getNumber() {
      System.out.print("enter a number: ");
      int num = sc.nextInt();
      return num;
   }
   
   public static int addNumber(int num1,int num2) {
      return num1 + num2;
   }
   
   public static void printNumber(int result) {
      System.out.println("number sum: " + result);
   }
}