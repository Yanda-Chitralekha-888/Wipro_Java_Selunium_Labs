package Lab3;


	import java.util.Arrays;

	public class Lab3Program4 {
	    public static void main(String[] args) {
	    	String[] products = {"Keyboard", "Mouse", "Monitor", "Laptop", "Charger"};

	        System.out.println("Original Product Names:");
	        for (String a : products)
	        {
	            System.out.println(a);
	        }

	       
	        Arrays.sort(products);

	        System.out.println("Sorted Product Names:");
	        for (String b : products)
	        {
	            System.out.println(b);
	        }
	    }
	}

