package Labs;

public class Individual {
	
	class NameValidationException extends Exception {
	    public NameValidationException(String message) {
	        super(message);
	    }
	}

	
	    private String firstName;
	    private String lastName;
	    private char gender;

	    public Individual(String firstName, String lastName, char gender) throws NameValidationException {
	        if (firstName == null || firstName.trim().isEmpty() ||
	            lastName == null || lastName.trim().isEmpty()) {
	            throw new NameValidationException("First Name and Last Name cannot be blank.");
	        }
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.gender = gender;
	    }

	    public String toString() {
	        return "Full Name: " + firstName + " " + lastName + "\nGender: " + gender;
	    }
	}

	// Renamed PersonMain to IndividualMain
  class IndividualMain {
    public static void main(String[] args) {
        try {
            Individual person1 = new Individual("Chitra", "Lekha", 'F');
            System.out.println(person1);

        } catch (Labs.Individual.NameValidationException e) { 
            System.out.println("Error: " + e.getMessage());
        }
    }
}


