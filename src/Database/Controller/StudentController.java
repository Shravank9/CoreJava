package Database.Controller;

import Database.DAOLayer.DAOStudent;

public class StudentController {

	public static void main(String[] args) {
		DAOStudent t = new DAOStudent();
		t.insertStudent();
	}

}
