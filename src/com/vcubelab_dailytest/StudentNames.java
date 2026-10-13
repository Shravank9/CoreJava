package com.vcubelab_dailytest;
import java.util.ArrayList;

public class StudentNames {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Ravi");
        students.add("Priya");
        students.add("Kiran");
        students.add("Sneha");
        students.add("Arjun");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}