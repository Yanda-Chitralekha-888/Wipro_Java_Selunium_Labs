package Labs;

import java.util.*;

public class Lab2 {

	public static void main(String[] args)

	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println(" Positive Number ");

			}

			else

				System.out.println("Negative number");
		}

	}
}
