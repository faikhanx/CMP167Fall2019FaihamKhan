/**
 * 
 * @author Faiham Khan
 *
 */

import java.util.Scanner;
import java.io.StringWriter;
import java.io.PrintWriter;

public class Unit3Pt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringWriter sw = new StringWriter ();
		PrintWriter pw = new PrintWriter (sw);
		
		pw.print("Faiham Khan");
		
		String name = sw.toString();
		
		int numClasses = 3;
		
		System.out.printf("%s has %d classes this term", name, numClasses);
	}

}
