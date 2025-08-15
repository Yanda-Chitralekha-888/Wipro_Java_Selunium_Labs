package Encapsulation;
import java.util.*;
public class Car {
	private static final String mi = null;
	static Scanner sc=new Scanner(System.in);
     private String cn;
     private String mn;
     private int year;
     private String mielage;
     Car()
     {	 
    	 mielage="50 km/h";
     }
     void setCar(String cn,String mn,int year)
     {
    	 this.cn=cn;
    	 this.mn=mn;
    	 this.year=year;
    	 
     }
     String getCN()
     {
    	return cn; 
     }
     String getMn() {
    	 return mn;
     }
     int getYear()
     {
    	 return year;
     }
     String getMi()
     {
    	 return mielage;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car c=new Car();
        c.setCar("Porsche", "RT",2025 );
        System.out.println(c.getCN()+"");
        System.out.println(c.getMn()+"");
        System.out.println(c.getYear()+"");
        System.out.println("Your car milage is"+c.getMi());
        
        		
 	}

}
