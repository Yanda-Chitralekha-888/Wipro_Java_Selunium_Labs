
package arraysString;
import java.util.Arrays;
import java.util.HashSet;
public class Hs {
	
	
	
	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HashSet <String> h=new HashSet <>();
			h.add("radha");
			h.add("krishna");
			h.add("chinni");
			System.out.println(h);
			h.remove("radha");
			System.out.println(h);
			System.out.println(h.isEmpty());
			System.out.println(Arrays.toString(h.toArray()));
			System.out.println(h.contains("chinni"));
		}

	}