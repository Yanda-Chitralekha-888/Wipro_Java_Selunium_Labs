package Day3;
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class Person {
    private String firstName;
    private String lastName;
    private char gender;

   
    public Person(String firstName, String lastName, char gender) throws InvalidNameException {
        if (firstName == null || firstName.trim().isEmpty() ||
            lastName == null || lastName.trim().isEmpty()) {
            throw new InvalidNameException("First Name and Last Name cannot be blank.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

   
 
    public String toString() {
        return "Full Name: " + firstName + " " + lastName + "\nGender: " + gender;
    }
}


public class PersonMain {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("Chitra", "Lekha", 'F');
            System.out.println(p1);

            
        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
