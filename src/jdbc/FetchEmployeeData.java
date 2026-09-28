package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchEmployeeData {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement s = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "root");
			s = con.createStatement(); 

			String sql = "Select * from employee";
			rs = s.executeQuery(sql);

			while (rs.next()) {
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
			}
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());

		} finally {
			if (con != null)
				con.close();
			if (s != null)
				s.close();
			if (rs != null)
				rs.close();

		}
	}

}
