package Encapsulation;
import java.util.*;

	public class Bank
	{
		static Scanner sc=new Scanner(System.in);
		
		private int an;
		private double balance;
		
		public int getAn()
		{
			return an;
		}
		public double getBal()
		{
			return balance;
		}
		public void setAn(int an)
		{
			this.an=an;
		}
		public void setBal(double balance)
		{
			this.balance =balance;
		}
		Bank()
		{
			balance=1000;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Bank b=new Bank();
			System.out.println("Enter your account number : ");
			b.setAn(sc.nextInt());
			System.out.println("Enter your balance : ");
			b.setBal(sc.nextDouble());
			System.out.println("Your account number is "+ b.getAn());
			System.out.println("Your balance is "+ b.getBal());
			
		}

	
	}


