package arraysString;
import java.util.ArrayList;
public class ArrayInt {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Integer> item=new ArrayList<>();
			item.add(10);
			item.add(20);
			item.add(10);
			item.add(50);
			item.add(20);
			item.add(40);
			item.add(30);
			
			System.out.println("Items in ArrayList:"+ item);
			
			item.remove(3);
	         System.out.println("Item removed in ArrayList:"+ item);
	         
		}

	


	}


