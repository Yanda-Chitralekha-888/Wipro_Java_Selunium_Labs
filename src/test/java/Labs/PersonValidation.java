package Labs;

public class PersonValidation {

	static class Person {
		private String name;
		private int age;

		public Person(String name, int age) throws InvalidAgeException {
			this.name = name;
			if (age <= 15) {
				throw new InvalidAgeException("Age must be above 15. Entered: " + age);
			}
			this.age = age;
		}

		public String toString() {
			return "Name: " + name + ", Age: " + age;
		}
	}

	static class InvalidAgeException extends Exception {
		public InvalidAgeException(String message) {
			super(message);
		}
	}

	// Main method
	public static void main(String[] args) {
		try {
			Person p1 = new Person("Chitra", 12); // change to >15 to avoid exception
			System.out.println(p1);
		} catch (InvalidAgeException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try {
			Person p2 = new Person("Lekha", 20); // valid
			System.out.println(p2);
		} catch (InvalidAgeException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
