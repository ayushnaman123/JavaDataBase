package in.coder.ai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		//Load and Register the driver get automatically it happens from java4.x need not to be load the class it load based or url
		
		
		//Because the db engine is running in same machine need not to provide location port is default
		String url="jdbc:mysql:///selfrevision";
		String userName = "root";
		String passWord = "Naman@2024#";
		
		//Establish the connection
		connection = DriverManager.getConnection(url, userName, passWord);
		System.out.println("CONNECTION Created...");
		
		//Create Statement Object Sent Query
		statement = connection.createStatement();
		
		//Create ResultSet object and Execute Query
		String sqlDeleteQuery ="Delete from students where sid=2"; 
		int rowsAffected = statement.executeUpdate(sqlDeleteQuery);
		
		System.out.println("Number of Rows Affected:: "+rowsAffected);
  		
		statement.close();
		connection.close();

	}

}
