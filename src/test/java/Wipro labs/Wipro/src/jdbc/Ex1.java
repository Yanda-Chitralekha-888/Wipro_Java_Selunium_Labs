package jdbc;
import java.sql.*;
public class Ex1{

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/myDB";
		String user="root";
		String pass="Chitra@003";
		// TODO Auto-generated method stub
		//REGISTER THE DRIVER CLASS
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, pass);
		
		Statement st=con.createStatement();
		
		String query="INSERT INTO employee VALUES(2, 'lekha', 30000)";
		String query1="UPDATE employee SET name='chitralekha' where name ='chitra'";
		String query2="DELETE FROM employee WHERE name='lekha'";
		
		st.addBatch(query);
		st.addBatch(query1);
		st.addBatch(query2);
		
		st.executeBatch();
		System.out.println("Done");
		con.close();
	}

}




