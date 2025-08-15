package jdbc;
import java.sql.*;
public class Ex2{

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/myDB";
		String user="root";
		String pass="Chitra@003";
		// TODO Auto-generated method stub
		//REGISTER THE DRIVER CLASS
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, pass);
		
		Statement st=con.createStatement();

		String query="select * from employee";
		
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("salary"));
		}
		System.out.println("Done");
		con.close();
	}

}


