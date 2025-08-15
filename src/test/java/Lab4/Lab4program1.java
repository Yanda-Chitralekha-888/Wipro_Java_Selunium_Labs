
package Lab4;

import java.io.*;

public class Lab4program1 {
    public static void main(String[] args) {
       
        try {
			FileReader fr=new FileReader("file.txt");
			
			StringBuffer sb=new StringBuffer();
			int ch;
			while((ch=fr.read())!=-1) {
				sb.append((char)ch);
			}
			fr.close();
			
			String revContent=sb.reverse().toString();
			
			FileWriter fw=new FileWriter("file.txt");
			fw.write(revContent);
			fw.close();
			
			System.out.println("File content reversed");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
