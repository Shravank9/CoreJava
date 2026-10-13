package Database.DAOLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Database.DBConnnection.DBconnection;

public class DAOStudent {

	Connection con = null;

	public void insertStudent() {

		try {

			con=DBconnection.getConnection();
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO student (id, name, age, marks) VALUES (?, ?, ?, ?)");

			// Student 1
			ps.setInt(1, 101);
			ps.setString(2, "Ravi");
			ps.setInt(3, 21);
			ps.setDouble(4, 85.5);
			ps.addBatch();

			// Student 2
			ps.setInt(1, 102);
			ps.setString(2, "Priya");
			ps.setInt(3, 22);
			ps.setDouble(4, 90.0);
			ps.addBatch();

			// Student 3
			ps.setInt(1, 103);
			ps.setString(2, "Kiran");
			ps.setInt(3, 20);
			ps.setDouble(4, 78.5);
			ps.addBatch();

			int n[] = ps.executeBatch();
			
			System.out.println(n.length + " student records inserted successfully.");
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
