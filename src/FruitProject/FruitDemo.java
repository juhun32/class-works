package FruitProject;



import java.util.Scanner;

public class FruitDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Fruit apple = new Fruit();
		
		apple.name = "Apple";
		apple.color = "Red";
		apple.numberPieces = 2;
		
		Fruit mango = new Fruit();
		
		mango.name = "Mango";
		mango.color = "Yellow";
		mango.numberPieces = 3;
		
		Fruit melon = new Fruit();
		
		melon.name = "Melon";
		melon.color = "Green";
		melon.numberPieces = 1;
		
		System.out.println(melon.name);
		System.out.println(melon.color);
		System.out.println(melon.numberPieces);
		
		Fruit orange = new Fruit();
		
		orange.name = "Orange";
		orange.color = "Orange";
		orange.numberPieces = 3;
		
		System.out.println(orange.name);
		System.out.println(orange.color);
		System.out.println(orange.numberPieces);		
		
		sc.close();
	}

}
