package Labs;

	import java.util.Scanner;

	public class EmployeeApp {

	    // Fields
	    private int id;
	    private String name;
	    private double salary;
	    private String designation;
	    private String insuranceScheme;

	    // Constructor
	    public EmployeeApp(int id, String name, double salary, String designation) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.designation = designation;
	        this.insuranceScheme = determineScheme();
	    }

	    // Method to determine insurance scheme
	    private String determineScheme() {
	        if (designation.equalsIgnoreCase("Manager") && salary >= 40000) {
	            return "Scheme A";
	        } else if (designation.equalsIgnoreCase("Programmer") && salary >= 20000) {
	            return "Scheme B";
	        } else if (designation.equalsIgnoreCase("Clerk") && salary < 20000) {
	            return "No Scheme";
	        } else {
	            return "No Scheme";
	        }
	    }

	    // Display employee details
	    public void displayDetails() {
	        System.out.println("\nEmployee Details:");
	        System.out.println("ID           : " + id);
	        System.out.println("Name         : " + name);
	        System.out.println("Salary       : ₹" + salary);
	        System.out.println("Designation  : " + designation);
	        System.out.println("Insurance    : " + insuranceScheme);
	    }

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); 

	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Salary: ");
	        double salary = sc.nextDouble();
	        sc.nextLine();

	        System.out.print("Enter Designation (Manager/Programmer/Clerk): ");
	        String designation = sc.nextLine();
	        EmployeeApp emp = new EmployeeApp(id, name, salary, designation);

	     
	        emp.displayDetails();

	        sc.close();
	    }
	}


