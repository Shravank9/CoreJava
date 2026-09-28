package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUD {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement s = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "root");
			s = con.createStatement();

			String sql = "insert into  employee value(119,'akash', 50000,'chashier')";
			int rs = s.executeUpdate(sql);
			System.out.println(rs + " row inserted");

			String sql1 = "Update employee set designation = 'azure engineer' where empno=108";
			int rs1 = s.executeUpdate(sql1);
			System.out.println(rs1 + " updted suscussfuly");

			String sql3 = "DELETE FROM employee WHERE empno = 106";

			int result = s.executeUpdate(sql3);

			System.out.println(result + " row deleted");

			String sql4 = "select * from emp where empno=101";
			ResultSet rss = s.executeQuery(sql4);
			System.out.println(rss + " fetched the data");

			while (rss.next()) {
				System.out.println(rss.getInt(1));
				System.out.println(rss.getString(2));
			}

		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());

		} finally {
			if (con != null)
				con.close();
			if (s != null)
				s.close();

		}
	}

}
