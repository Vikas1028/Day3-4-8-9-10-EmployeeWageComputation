package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	public int Presenti;

	// Start with displaying welcome message
	public void printMessage() {
		System.out.println("Welcome to Employee Wage Computation Program");
	}

	// Check employee is present or absent
	public void checkEmployeeAttendance() {
		Random num = new Random();
		Presenti = num.nextInt(2);
		if (Presenti == 0) {
			System.out.println("Employee is Absent");
		} else {
			System.out.println("Employee is Present");
		}
	}

	public static void main(String[] args) {

		EmployeeWageComputation call = new EmployeeWageComputation();

		call.printMessage();

		call.checkEmployeeAttendance();
	}
}
