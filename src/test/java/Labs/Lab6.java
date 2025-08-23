package Labs;

import java.util.*;

public class Lab6 {
	static Scanner sc = new Scanner(System.in);

	String add(String a, String b) {
		return a + b;
	}

	String odd(String a) {
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			if (i % 2 == 1) {
				b += "#";
			} else {
				b += a.charAt(i);
			}
		}
		return b;
	}

	String dup(String a) {
		String s = a;
		String b = "";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int oc = 0;
			for (int j = 0; j < c.length; j++) {
				if (c[i] == c[j]) {
					oc++;
				}
			}
			for (int j = 0; j <= i; j++) {
				if (c[i] == c[j]) {
				}
			}
			if (oc <= 1) {
				b += c[i];
			}
		}
		return b;

	}

	String oddUpper(String a) {
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			if (i % 2 == 1) {
				String c = "" + a.charAt(i);
				c = c.toUpperCase();
				b += c;
			} else {
				b += a.charAt(i);
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab6 x = new Lab6();
		System.out.println(x.add("Chitra", "Lekha"));
		System.out.println(x.odd("Chitralekha"));
		System.out.println(x.oddUpper("yadav"));
		System.out.println(x.dup("apple"));

	}

}
