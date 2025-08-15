
package jdbc;
import java.sql.*;
public class Ex3{


	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/myDB";
		String user="root";
		String pass="Chitra@003";
		// TODO Auto-generated method stub
		//REGISTER THE DRIVER CLASS
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, pass);
		
		String query="DELETE FROM employee WHERE name='yanda'";
		
		PreparedStatement st=con.prepareStatement(query);
		
		
		st.executeUpdate();
		System.out.println("Done");
		con.close();
	}

}