
import java.util.Scanner;

public class TelevisionDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the brand of the television?: ");
		String brand = sc.next();
		Television userTV = new Television(brand);
		
		sc.close();
	}
}
