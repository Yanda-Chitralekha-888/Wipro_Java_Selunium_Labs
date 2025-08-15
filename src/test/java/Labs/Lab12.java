package Labs;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first date (YYYY-MM-DD): ");
            LocalDate date1 = LocalDate.parse(scanner.nextLine().trim());

            System.out.print("Enter second date (YYYY-MM-DD): ");
            LocalDate date2 = LocalDate.parse(scanner.nextLine().trim());

            // Compute period: always from earlier to later
            LocalDate start = date1.isBefore(date2) ? date1 : date2;
            LocalDate end = date1.isBefore(date2) ? date2 : date1;

            Period period = Period.between(start, end);
            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();

            System.out.printf("Difference: %d years, %d months, %d days %s %n",
                years, months, days,
                (date1.isBefore(date2) ? "from first until second" 
                                        : "from second until first"));

        } catch (DateTimeParseException ex) {
            System.out.println("Invalid date format, please use YYYY-MM-DD.");
        } finally {
            scanner.close();
        }
    }
}


