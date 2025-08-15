
package Labs;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		
	
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter a string: ");
		String input = sc.nextLine().toUpperCase();
		boolean isPositive = true;

		for (int i = 0; i < input.length() - 1; i++) {
		    if (input.charAt(i) > input.charAt(i + 1)) {
		        isPositive = false;
		        break;
		    }
		}

		if (isPositive)
		    System.out.println("The string is positive.");
		else
		    System.out.println("The string is not positive.");
	}
    
}
}