package Labs;

import java.time.LocalDate;
import java.time.Period;

public class Lab15 {

	public static int calculateAge(LocalDate dob) {
		LocalDate currentDate = LocalDate.now();
		if (dob != null && !dob.isAfter(currentDate)) {
			return Period.between(dob, currentDate).getYears();
		} else {
			return 0;
		}
	}

	// Method to return full name
	public static String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public static void main(String[] args) {
		// Sample data
		String firstName = "Chitra";
		String lastName = "Yadav";
		LocalDate dob = LocalDate.of(2003, 8, 17);// Example DOB

		String fullName = getFullName(firstName, lastName);
		int age = calculateAge(dob);

		// Display results
		System.out.println("Full Name: " + fullName);
		System.out.println("Age: " + age + " years");
	}
}
