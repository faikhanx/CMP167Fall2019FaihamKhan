Mega Millions Program
1. Ask the user how much they would like to play with
2 Store the value that they input into a variable
3. Ask the user to input 6 numbers
4. Store the value that they input into a variable
5. Randomly generate a 6-digit long number
6. Compare the number that they input with the randomly generated number
	a) If the two are equal, tell the user that they have won.
	b) If the two are not equal, tell the user that they have lost.
7. If the user won, multiply the first numbeer they input by 1,000,000 and let them know that is their prize.
 


import java.util.Scanner;
public class MegaMillions {
	/**
	 * 
	 * @author F Khan
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in);
	System.out.println("Hello, this program simulates the Mega Millions.  Enter the amount you would like to play with.");
	
	int stake = input.nextInt();
	
	System.out.println("Enter a 6 digit number);
	
	int guess = input.nextInt();
			   

	}

}
