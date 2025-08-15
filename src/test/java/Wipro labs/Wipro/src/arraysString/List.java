package arraysString;
import java.util.ArrayList;

public class List {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> item=new ArrayList<>();
		item.add("Chitra");
		item.add("Lekha");
		item.add("ChitraLekha");
		item.add("Yadav");
		System.out.println("Items in ArrayList:"+ item);
		
         item.remove("ChitraLekha");
         System.out.println("Item removed in ArrayList:"+ item);
	}

}
