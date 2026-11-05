package AdvanceJava.DAOLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import AdvanceJava.DAOConnection.DAOConnection;
import AdvanceJava.Utility.Student;

public class DAOlayer {
	static Connection con = null;

	public void getallStudnetsByID(Student s) {

		try {
			con = DAOConnection.getConnecction();
			PreparedStatement ps = con.prepareStatement("select * from employee where empno=(?)");
			ps.setInt(1, s.getEmpno());
			ResultSet rs = ps.executeQuery();
			System.out.printf("%-10s %-20s %-12s %-20s%n", "EmpNo", "EmpName", "Salary", "Designation");

			System.out.println("--------------------------------------------------------------");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "  ");
				System.out.print(rs.getString(2) + "  ");
				System.out.print(rs.getDouble(3) + "  ");
				System.out.print(rs.getString(4) + "  ");
				System.out.println();

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void getallStudnets() {

		try {
			con = DAOConnection.getConnecction();
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			System.out.printf("%-10s %-20s %-12s %-20s%n", "EmpNo", "EmpName", "Salary", "Designation");

			System.out.println("--------------------------------------------------------------");
			while (rs.next()) {

				System.out.print(rs.getInt(1) + "  ");
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getDouble(3) + "  ");
				System.out.print(rs.getString(4) + "  ");
				System.out.println();

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertStudents(Student s) {

		try {
			con = DAOConnection.getConnecction();
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, s.getEmpno());
			ps.setString(2, s.getEmpname());
			ps.setDouble(3, s.getSal());
			ps.setString(4, s.getDesignation());

			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println(n + " " + "Rows Affected");
			} else {
				System.out.println("Something went wrong");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void UpdateStudentbyId(Student s) {

		try {
			con = DAOConnection.getConnecction();
			PreparedStatement ps = con.prepareStatement("update  employee set empname=? where empno=?");
			ps.setString(1, s.getEmpname());
			ps.setInt(2, s.getEmpno());

			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println(n + " " + "Rows Affected");
			} else {
				System.out.println("Something went wrong");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void DeleteStudentbyId(Student s) {

		try {
			con = DAOConnection.getConnecction();
			PreparedStatement ps = con.prepareStatement("delete from  employee where empno=?");
			ps.setInt(1, s.getEmpno());
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println(n + " " + "Rows Deleted");
			} else {
				System.out.println("Something went Wrong");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
