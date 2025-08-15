package arraysString;
import java.util.HashMap;
public class Hm{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> h=new HashMap<>();
		h.put(0, "Radhakrishna");
		h.put(1, "Ramaseetha");
		h.put(2, "max");
		System.out.println(h);
		System.out.println(h.get(2));
		System.out.println(h.isEmpty());
		System.out.println(h.replace(2, "PLUTO"));
		System.out.println(h);
	}

}



