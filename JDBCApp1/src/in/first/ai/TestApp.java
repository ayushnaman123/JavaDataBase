package in.first.ai;
import java.sql.*;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
		// Load and Register the driver	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish the connection
		String url = "jdbc:mysql://localhost:3306/selfrevision";
		String userName = "root";
		String password = "Naman@2024#";
		connection = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Established...");
		System.out.println("The implementation class is "+connection.getClass().getName());
		
		// Create Statement Object and Execute Query
		statement = connection.createStatement();
		System.out.println("The implementation class is "+statement.getClass().getName());
		
		String sqlQuery = "Select sid, sname, sage , saddress from students";
		resultSet = statement.executeQuery(sqlQuery);
		System.out.println("The implementation class is "+resultSet.getClass().getName());
		
		// Process the ResultSet
		System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
		while(resultSet.next()) {
			Integer sId = resultSet.getInt(1);
			String sName = resultSet.getString(2);
			Integer sAge = resultSet.getInt(3);
			String sAddress = resultSet.getString(4);
			
			System.out.println(sId+"\t"+sName+"\t"+sAge+"\t"+sAddress);
		}
		
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// Close the Connection
			if(connection!=null) {
				try {
					connection.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
			}
		}

	}

}
