package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 


		System.out.print("Starting Bet: ");
		double startAmount = in.nextDouble();

		System.out.print("Win Chance: ");
		double winChance = in.nextDouble(); 

		System.out.print("Win Limit: ");
		double winLimit  = in.nextDouble();


		while ((startAmount < winLimit) && (startAmount > 0)) {
			if (Math.random() <= winChance) {
				startAmount++;
				System.out.println("You won a Dollar!");
			}


			else { 
				System.out.print("You lost a Dollar");
			    startAmount--;  
			}



		}
	}
}







