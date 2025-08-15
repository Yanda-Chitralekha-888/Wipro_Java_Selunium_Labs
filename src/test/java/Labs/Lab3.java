
package Labs;
 
public class Lab3 {
	String FirstName;
	String LastName;
	char gender;
	
public Lab3(String firstName, String lastName, char gender) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.gender = gender;
	}
 
public String getFirstName() {
	return FirstName;
}
 
public void setFirstName(String firstName) {
	FirstName = firstName;
}
 
public String getLastName() {
	return LastName;
}
 
public void setLastName(String lastName) {
	LastName = lastName;
}
 
public char getGender() {
	return gender;
}
 
public void setGender(char gender) {
	this.gender = gender;
}
void display() {
	System.out.println("First Name: "+getFirstName());
	System.out.println("Last Name: "+getLastName());
	System.out.println("gender: "+getGender());
}
 
public static void main(String[] args) {
	Lab3 p=new Lab3("Yanda", "Chitralekha",'F');
	p.display();
}
}
 