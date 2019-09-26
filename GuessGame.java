/**
 * 
 * @author Khan
 * @ description A guessing game
 * @ created 9/26/19
 */

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Random;
public class GuessGame {
	static Scanner input = new Scanner (System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Introduce the program
		System.out.println("Welcome to  Guessing 3000");
		
		System.out.println("Would you like to play?");
		
		String answer = input.next();
		
		while (answer.equalsIgnoreCase("yes")) {
		System.out.println("Enter a number from 1 - 10: ");
		int userNumber = input.nextInt();
		int pcNumber = rand.nextInt(10) + 1;
		
		if (userNumber == pcNumber) {
			System.out.println("You won!");
			System.out.println("The PC chose " + pcNumber);
		} else {
			System.out.println("You lost!");
			System.out.println("The PC chose " + pcNumber);
			
			
		}
		System.out.println ("Would you like to play again?");
		answer = input.next();
		
	}
		System.out.println ("OK, come back soon!");
	
		
		 
		
		

	}

}
