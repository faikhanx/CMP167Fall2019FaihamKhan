import java.util.Scanner;
public class AddThree {
	/**
	 * 
	 * @author F Khan
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three separate numbers to add");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int result = num1 + num2 + num3;
		System.out.println("Result is " + result);
		
		

	}

}