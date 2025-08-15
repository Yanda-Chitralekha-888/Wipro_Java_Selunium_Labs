package Package_day3;

public class Student {
int id;
String name;
String address;
String contact;
public void student_display() {
	System.out.println("student id is"+id);
	System.out.println("student name is"+name);
	System.out.println("student addressis"+address);
	System.out.println("student contact is"+contact);
	}
public static void main(String[] args) {
	Student s1=new Student();
	s1.id=2;
	s1.name="chitra";
	s1.address="kurnool";
	s1.contact="222";{
		s1.student_display();
	}	
}
}



