package com.ajit.StudentApp;

import java.util.Scanner;

/**
 * @Auhtor : Ajit Rajkumar M S
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("============Welcome to Student Details management============");
        int choice=0;
		Scanner sc = new Scanner(System.in);
        
        while(true)
        {
        	System.out.println("1.Add Student   2.Remove Student 3.Display Student 4.Search Details");
            System.out.println("Enter the choice:");
        	choice = sc.nextInt();
        	switch(choice) {
        	case 1:
        		System.out.println("Enter the details of the Student");
        		Student s1 = new Student();
        		System.out.println("ENter the name: ");
        		s1.setName(sc.next());
        		System.out.println("Enter the rollno: ");
        		s1.setRollno(sc.nextInt());
        		System.out.println("Enter the grade: ");
        		s1.setGrade(sc.next());
        		Student.addStudent(s1);
        		break;
        	case 2:
        		System.out.println("Delete the Student details");
        		System.out.println("Enter the rollno of the student: ");
        		Student.removeStudent(sc.nextInt());
        		break;
        	case 3:
        		System.out.println("Display the student details");
        		Student.displayStudentDetails();
        		break;
        	case 4:
        		System.out.println("Search the student");
        		System.out.println("Enter the rollno : ");
        		System.out.println(Student.searchStudent(sc.nextInt()));
        		break;
        	case 99:
        		System.out.println("Thank you ");
        		System.exit(0);
        	default:
        		System.out.println("Enter the valid choice :) ");
    
        	}
        }
    }
}
