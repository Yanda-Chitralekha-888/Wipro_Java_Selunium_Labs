package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/sys";
		String user="root";
		String pass="Chitra@003";
		// TODO Auto-generated method stub
		//REGISTER THE DRIVER CLASS
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, pass);
		
		Statement st=con.createStatement();

		String query="select * from sys.db";
		
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("clg_name"));
		}
		System.out.println("Done");
		con.close();
	}

}



