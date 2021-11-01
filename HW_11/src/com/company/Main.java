package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
	ArrayList<Student> st = new ArrayList<>();
	st.add(new Student("Bill", 1));
	st.add(new Student("Stephen", 1));
	st.add(new Student("Bob", 3));
	st.add(new Student("Stephen", 2));
    Student.printStudent(st);
    Student.compByName(st);
		System.out.println();
	Student.compByCourse(st);
	Student.findByName(st);
	Student.findByCourse(st);
    }
}
