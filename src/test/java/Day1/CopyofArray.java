package Day1;

public class CopyofArray {


	public static void main(String[] args) 
	{
		int a[]= {30,20,10};
		int c[]= new int[a.length];     //creates the array with the same size of array a
		for(int i=0;i<a.length;i++)
		{
		     c[i]=a[i];                 //copies the array a elements to c array
		}
		System.out.println("Copied array elments are ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(c[i]);     //prints the c array elements
		}
	}
}

