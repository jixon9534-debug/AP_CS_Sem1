/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		
		Employee Pam = new Employee(2011, "Pam", "Bessly", 2250);
		Pam.employeeToString();
		
		Employee James = new Employee(2047, "James", "Yap", 5000);
		James.employeeToString();
		
		michael.raiseSalary(4);
		Dwight.raiseSalary(10);
		Jim.raiseSalary(15);
		Pam.raiseSalary(99);
		James.raiseSalary(5);
		
		System.out.println("Michaels Annual salery is " + michael.getAnnualSalary());
		System.out.println("Dwights Annual salery is " + Dwight.getAnnualSalary());
		System.out.println("Jims Annual salery is " + Jim.getAnnualSalary());
		System.out.println("Pams Annual salery is " + Pam.getAnnualSalary());
		System.out.println("James Annual salery is " + James.getAnnualSalary());
		
		System.out.println("Michaels Annual salery is " + michael.getSalary());
		System.out.println("Dwights Annual salery is " + Dwight.getSalary());
		System.out.println("Jims Annual salery is " + Jim.getSalary());
		System.out.println("Pams Annual salery is " + Pam.getSalary());
		System.out.println("James Annual salery is " + James.getSalary());
	}
}
