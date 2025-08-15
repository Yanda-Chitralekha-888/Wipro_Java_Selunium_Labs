package Encapsulation;
import java.util.*;
public class Rectangle {
	static Scanner sc=new Scanner(System.in);
	private int len;
	private int width;
	
	void setLen( int len)
	{
		this.len=len;
	}
	void setWidth(int width)
	{
		this.width=width;
	}
   public int getLen() 
   {
	   return len;
   }
   public int getWidth() 
   {
	   return width;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.setLen(20);
		r.setWidth(30);
		System.out.println(r.getLen());
		System.out.println(r.getWidth());
		
				

	}

}
