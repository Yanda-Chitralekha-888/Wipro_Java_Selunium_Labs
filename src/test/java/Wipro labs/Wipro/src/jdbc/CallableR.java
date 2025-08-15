package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class CallableR{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		String url = "jdbc:mysql://localhost:3306/myDB";
		String user ="root";
		String pass="Chitra@003";
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con=DriverManager.getConnection(url, user, pass);
			
			CallableStatement cst=con.prepareCall("{call employee()}");
			
			ResultSet rs=cst.executeQuery();	
			while(rs.next())
			{
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("salary"));
			}
			
			System.out.println("done");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	

}



}
