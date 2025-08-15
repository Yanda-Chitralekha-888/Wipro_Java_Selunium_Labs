package Encapsulation;
import java.util.*;
public class Employee {
	static Scanner sc=new Scanner(System.in);
	private  String name;
	private int Id;
	private int  Salary;
	

	void  setName(String Name )
	{
		this.name=Name;
	}
	void setId(int Id)
	{
		this.Id=Id;
	}
	void setSalary(int Salary)
	{
		this.Salary=Salary;
	}
	public  String getName()
	{
		return name;
	}
	public  int getId()
	{
		return Id;
	}
	public  int getSalary()

	{
		return Salary;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setName( "Chitra Yadav");
		e.setId(4796709);
		e.setSalary(400000);
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.print(String.format("%d",e.getSalary()));
		
		
		

	}

}
