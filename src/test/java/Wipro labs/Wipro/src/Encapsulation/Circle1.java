package Encapsulation;

	import java.util.*;

	public class Circle1 {

		static Scanner sc= new Scanner(System.in);

		

		private double r;

		void setRadius(double r)

		{

			this.r=r;

		}

		double getRadius()

		{

			return r;

		}

		double perimeter(double a)

		{

			return 2*3.14*a;		//perimeter = 2pi r

		}

		double area(double a)

		{

			return 3.14*a*a;			//area pi r square

		}

		

		public static void main(String[] args) {

			// TODO Auto-generated method stub

			Circle1 c= new Circle1();

			System.out.println("Enter the radius");

			c.setRadius(sc.nextInt());

			System.out.println(c.perimeter(c.getRadius()));

			System.out.println(c.area(c.getRadius()));

		}

	}

