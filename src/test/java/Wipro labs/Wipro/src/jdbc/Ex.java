package jdbc;
import java.sql.*;
public class Ex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/sys";
		String user="root";
		String pass="Chitra@003";
		// TODO Auto-generated method stub
		//REGISTER THE DRIVER CLASS
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, pass);
		
		Statement st=con.createStatement();
		
		String query="INSERT INTO   VALUES (2,'yadav',kl";
		
		st.executeUpdate(query);
		System.out.println("Done");
		con.close();
	}

}


