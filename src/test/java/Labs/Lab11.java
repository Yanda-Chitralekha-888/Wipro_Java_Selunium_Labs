package Labs;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Lab11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a date  ");
		String input = scanner.nextLine().trim();

		try {
			LocalDate inputDate = LocalDate.parse(input);
			LocalDate today = LocalDate.now();

			Period period;
			boolean future = inputDate.isAfter(today);
			if (future) {
				period = Period.between(today, inputDate);
			} else {
				period = Period.between(inputDate, today);
			}

			int years = period.getYears();
			int months = period.getMonths();
			int days = period.getDays();

			System.out.printf("Difference: %d years, %d months, %d days %s today%n", years, months, days,
					(future ? "until" : "since"));

		} catch (DateTimeParseException ex) {
			System.out.println("Invalid format. Please use YYYY-MM-DD.");
		} finally {
			scanner.close();
		}
	}
}
