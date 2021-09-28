package database;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String URL = "jdbc:mysql://localhost:3306/ecommerce";
		String UserName = "root";
		String Password = "root";
		
		DBConnection dbobj = new DBConnection(URL,UserName,Password);
		Statement statement = dbobj.getConnection().createStatement();
		
		//CallableStatement statement1 = dbobj.getConnection().prepareCall("{call add_product(?, ?)}");
		
		//statement.executeUpdate("insert into eproduct (name, price, date_added) values ('Calculator', 1500.00, now())");
		
		//statement.executeUpdate("create database mydb");
		
		//statement.executeUpdate("Drop database mydb");
		
		//statement.executeUpdate("update eproduct set name='Calculator' where id = 4");
		
		//statement1.setString(1, "Washing Machine");
        //statement1.setInt(2, 5000);
        //statement1.executeUpdate();
		
		ResultSet result = statement.executeQuery("select * from eproduct");
		
		while(result.next()) {
			System.out.println("ID: "+result.getString("ID"));
			System.out.println("Name: "+result.getString("name"));
		}
		
		dbobj.closeConnection();

	}

}
