package Labs;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Lab13 {

	public static LocalDate computeExpiry(LocalDate purchaseDate, int warrantyYears, int warrantyMonths) {

		LocalDate afterYears = purchaseDate.plusYears(warrantyYears);
		LocalDate expiryDate = afterYears.plusMonths(warrantyMonths);
		return expiryDate;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter purchase date (YYYY-MM-DD): ");
			LocalDate purchase = LocalDate.parse(scanner.nextLine().trim());

			System.out.print("Enter warranty period years: ");
			int years = Integer.parseInt(scanner.nextLine().trim());

			System.out.print("Enter warranty period months: ");
			int months = Integer.parseInt(scanner.nextLine().trim());

			LocalDate expiry = computeExpiry(purchase, years, months);
			System.out.printf("Warranty expires on: %s%n", expiry);

		} catch (DateTimeParseException ex) {
			System.out.println("Invalid date format. Use YYYY-MM-DD.");
		} catch (NumberFormatException ex) {
			System.out.println("Invalid number for years or months.");
		} finally {
			scanner.close();
		}
	}
}
