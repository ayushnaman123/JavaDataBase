package in.first.ai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Connection connection = null;
				Statement statement = null;
				ResultSet resultSet = null;
				try {
					//Load and Register the Driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//Establish the Connection
					String url = "jdbc:mysql://localhost:3306/selfrevision";
					String userName = "root";
					String passWord = "Naman@2024#";
					connection = DriverManager.getConnection(url, userName, passWord);
					
					//Create statement object and sent query
					statement = connection.createStatement();
					//execute the query and process the resultSet
					String sqlQuery = "Select sid, sname, sage, saddress from students";
					resultSet = statement.executeQuery(sqlQuery);
					
					System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
					while(resultSet.next()) {
						Integer sId = resultSet.getInt(1);
						String sName = resultSet.getString(2);
						Integer sAge = resultSet.getInt(3);
						String sAddress = resultSet.getString(4);
						
						System.out.println(sId+"\t"+sName+"\t"+sAge+"\t"+sAddress);
					}
					//Handle the SQLexception if it generated
					
					// Closing the resources
					
				} catch (ClassNotFoundException ce) {
					
					ce.printStackTrace();
				} catch (SQLException se) {
					se.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try{
						if(connection!=null) {
							connection.close();
						}
						
					}catch(SQLException se) {
						se.printStackTrace();
					}
				}


	}

}
