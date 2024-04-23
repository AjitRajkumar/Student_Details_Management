package com.ajit.StudentApp;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int rollno;
	private String name;
	private String grade;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student rollno=" + rollno + ", name=" + name;
	}
	public static List<Student> StudentList = new ArrayList<Student>();
	
	public static void addStudent(Student student)
	{
		StudentList.add(student);
	}
	public static void removeStudent(int rollno)
	{
		Student stud = searchStudent(rollno);
		if(stud==null)
		{
			System.out.println("Entered student is not available");
		}
		else
		{
			StudentList.remove(stud);
			System.out.println("Student details deleted successfully");
		}
	}
	public static void displayStudentDetails()
	{
		for(Student stud :StudentList)
		{
			System.out.println(stud);
		}
	}
	public static Student searchStudent(int rollno)
	{
		for(Student stud:StudentList)
		{
			if(stud.rollno==rollno)
			{
				return stud;
			}
		}
		return null;
	}

	
}
