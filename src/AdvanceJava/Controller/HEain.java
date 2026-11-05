package AdvanceJava.Controller;

import AdvanceJava.DAOLayer.DAOlayer;
import AdvanceJava.Utility.Student;

public class HEain {
	public static void main(String[] args) {

		DAOlayer t = new DAOlayer();

		t.getallStudnets();
		Student s = new Student();

		s.setEmpno(108);
		t.getallStudnetsByID(s);
		Student s1 = new Student();

		s1.setDesignation("Loop Engineering");
		s1.setEmpname("Rahul");
		s1.setEmpno(111);
		s1.setSal(35000);

		t.insertStudents(s1);

		Student s2 = new Student();
		s2.setEmpname("Varshith");
		s2.setEmpno(109);
		t.UpdateStudentbyId(s2);

		Student s3 = new Student();
		s3.setEmpno(119);
		t.DeleteStudentbyId(s3);

	}

}
