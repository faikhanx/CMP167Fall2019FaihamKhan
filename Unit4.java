/**
 * 
 * @author Khan
 * @description - This program checks the user age and sees if the user can drink alcohol
 */

import java.util.Scanner;
public class Unit4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String name;
		String option = "can't";
		Scanner input = new Scanner (System.in);
		
		System.out.println("This program will check if you are legal to drink alcohol");
		System.out.println("Enter your name: ");
		
		name = input.next();
		
		System.out.printf("Ok %s, Enter your age: ", name);
		age = input.nextInt();
		
		if (age >= 21) {
			System.out.println("You can drink alcohol");
		} else {
			System.out.println("You can't drink alcohol");
		
		}
	}

}
