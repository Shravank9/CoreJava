package Database.DBConnnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

	static Connection con = null;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
			System.out.println("Database connected successfully!");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}