package learning;

import java.util.Scanner;

public class Condition {

//	public static void main(String[] args) {
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("enter the number");
//		int num =scanner.nextInt();
//		if( num >10) {
//			System.out.println("number is greater than two");
//		}else if(num == 10){
//			System.out.println("number is equal");
//		}
//		else {
//			System.out.println("number is smaller than two");
//		}
//	}
	public static void main(String[] args) {
		
		int date = 22;
		int doy = 2000;
		int age = 22;
		int nest = 100000;
		int totalage = date + doy;
		if( totalage == doy+ date) {
			
			if(totalage > age) {
				if(nest > totalage) {
					System.out.println("exact nmber");
				}
				else
				{
					System.out.println("invalid");
				}
			}
		}
		else
		{
			System.out.println("not valid");
		}
	}
	
}
