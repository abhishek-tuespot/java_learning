package learning;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSecisor {
	
	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
			Random random =new Random();
			int comp_choice = random.nextInt(3);
			
			
//			System.out.println( "0 ->Rock , 1->Paper , 2-> Sesior ");
			System.out.println("what do you choose ");
			int your_choice = scanner.nextInt();
			
			System.out.printf("You choose %d \n ", your_choice);
			System.out.printf("computer choose %d \n ", comp_choice);
			
			if (your_choice == comp_choice) {
				System.out.println("Game is Drow !!");
			}
			else if(comp_choice == 0){
				if(your_choice == 1) {
					System.out.println("you won ");
				}else if(your_choice ==2) {
					System.out.println("comp won !");
				}
			}
			else if(comp_choice == 1){
				if(your_choice == 2) {
					System.out.println("you won ");
				}else if(your_choice == 0) {
					System.out.println("comp won !");
				}
			}
			else if(comp_choice == 2){
				if(your_choice == 0) {
					System.out.println("you won ");
				}else if(your_choice == 1) {
					System.out.println("comp won !");
				}
			}
	}
}
