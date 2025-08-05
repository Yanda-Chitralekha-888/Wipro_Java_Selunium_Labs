package Day1;
import java.util.*;
public class MulTable {
    static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
          System.out.println("Which table do you want to print");
         int n=sc.nextInt() ;
         for(int i=1;i<12;i++)
         {
        	 System.out.println(n + " * " + i + " = " + (n * i));

         }
	}
}


