
package AdvanceJava.Utility;

public class Student {

    private int empno;
    private String empname;
    private double sal;
    private String designation;

    // Default constructor
    public Student() {

    }

    // Parameterized constructor
    public Student(int empno, String empname, double sal, String designation) {
        this.empno = empno;
        this.empname = empname;
        this.sal = sal;
        this.designation = designation;
    }

    // Getters and Setters
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
