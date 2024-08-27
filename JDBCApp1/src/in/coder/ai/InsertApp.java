package in.coder.ai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		
		//Connection Established
		String url = "jdbc:mysql:///selfrevision";
		String userName = "root";
		String passWord = "Naman@2024#";
		connection = DriverManager.getConnection(url, userName, passWord);
		System.out.println("Connection Establised...");
		//Statement Object Created and sent the query
		statement = connection.createStatement();
		
		String sqlInsertQuery = "Insert into students(`sname`, `sage`, `saddress`) values('Rishabh', 29, 'Delhi')";
		
		//Execute the query
		int rowsAffected = statement.executeUpdate(sqlInsertQuery);
		
		System.out.println("The Number of RowsAffected:: "+rowsAffected);
		
		statement.close();
		connection.close();
		System.out.println("Closing the resources....");

	}

}
