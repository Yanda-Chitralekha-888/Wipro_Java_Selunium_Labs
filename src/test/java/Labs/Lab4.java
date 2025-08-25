package Labs;

import java.util.*;

public class Lab4 {

	static Scanner sc = new Scanner(System.in);

	String fn;
	String ln;
	String gender;
	String ph;

	Lab4() {

	}

	Lab4(String fn, String ln, String gender) {
		super();
		this.fn = fn;
		this.ln = ln;
		this.gender = gender;
	}

	void setPh(String phno) {
		this.ph = phno;
	}

	String getPh() {
		return ph;
	}

	String getFN() {
		return fn;
	}

	String getLN() {
		return ln;
	}

	String getGender() {
		return gender;
	}

	void dis() {
		System.out.println("FirstName is " + getFN());
		System.out.println("LastName is " + getLN());
		System.out.println("Gender is " + getGender());
		System.out.println("Phone number is " + getPh());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4 x = new Lab4("CHITRALEKHA", "YANDA", "FEMALE");
		x.setPh("7337381648");
		x.dis();
	}

}