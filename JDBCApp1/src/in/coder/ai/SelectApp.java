package in.coder.ai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		
			//Load and Register the Driver
			
			//Establish the Connection
			String url = "jdbc:mysql:///selfrevision";
			String userName = "root";
			String passWord = "Naman@2024#";
			connection = DriverManager.getConnection(url, userName, passWord);
			System.out.println("CONNECTION created...");
			
			//Create statement object and sent query
			statement = connection.createStatement();
			System.out.println("Statment object created...");
			//execute the query and process the resultSet
			String sqlQuery = "Select sid, sname, sage, saddress from students";
			resultSet = statement.executeQuery(sqlQuery);
			System.out.println("ResultSet object created...");
			
			System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
			while(resultSet.next()) {
				Integer sId = resultSet.getInt("sid");
				String sName = resultSet.getString("sname");
				Integer sAge = resultSet.getInt("sage");
				String sAddress = resultSet.getString("saddress");
				
				System.out.println(sId+"\t"+sName+"\t"+sAge+"\t"+sAddress);
			}
			//Handle the SQLexception if it generated
			
			// Closing the resources
			resultSet.close();
			statement.close();
			connection.close();
			System.out.println("Resources Closed...");
		

	}

}
