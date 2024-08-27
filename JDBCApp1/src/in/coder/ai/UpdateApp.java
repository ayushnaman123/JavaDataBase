package in.coder.ai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		
		//Established the Connection
		String url = "jdbc:mysql:///selfrevision";
		String userName = "root";
		String passWord = "Naman@2024#";
		connection = DriverManager.getConnection(url, userName, passWord);
		System.out.println("Connection Created...");
		
		//Create Statement Object and Sent the Query
		statement = connection.createStatement();
		
		//Execute the Query
		String sqlUpdateQuery = "Update students set saddress='Mumbai' where sid = 4";
		int rowsAffected = statement.executeUpdate(sqlUpdateQuery);
		System.out.println("The number of rowsAffected:: "+rowsAffected);
		
		//Closing the resources
		statement.close();
		connection.close();
		System.out.println("Closing the Resources...");

	}

}
