package edu.java.basics;

public class StudentClass {
	
	public static void main(String[] args) {
		StudentClass.setStudentData(38, "Komal", 99.57);
		StudentClass.setStudentData(125, "Chinmay", 92.13);
		StudentClass.setStudentData(69, "Kuldip", 96.22);
	}
	
	public static void setStudentData(int r, String n, double m)
	{
		System.out.println("Student with roll number "+r+" named "+n+ " has scored "+m+" in maths");
	}
}

