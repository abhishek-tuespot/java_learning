package learning;

import java.util.Scanner;

public class TakingInputFromUser {

	
	public static void main(String[] args) {
		
		System.out.println("taking input from user");
	// here we create a new object 
		Scanner scanner = new Scanner(System.in);
		
		//we take number from user
		System.out.println("Enter num 1");
		int a = scanner.nextInt();
		System.out.println("Enter num 2");
		int b = scanner.nextInt();
		int sum = a+b;
		System.out.println("The sum of two number");
		System.out.println(sum);
		
		
		//	String string = scanner.next();
		//	System.out.println(string);
		
		
	}
}
