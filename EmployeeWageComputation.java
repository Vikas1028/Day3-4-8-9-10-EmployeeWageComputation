package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	public int Presenti;
	public int WagePerHour, FullDayHours, HalfDayHours, Hours;

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

	// Calculate Daily Employee Wage
	public void calculateEmployeeDailyWage() {
		WagePerHour = 20;
		FullDayHours = 8;
		HalfDayHours = 4;
		if (Presenti == 1) {
			Random num = new Random();
			Hours = num.nextInt(2);
			if (Hours == 1) {
				System.out.println("Today Employee work Full day");
				System.out.println("Today Employee Wage is " + WagePerHour * FullDayHours + " Rs.");
			} else {
				System.out.println("Today Employee work Half day");
				System.out.println("Today Employee Wage is " + WagePerHour * HalfDayHours + " Rs.");
			}
		}

	}

	public static void main(String[] args) {

		EmployeeWageComputation call = new EmployeeWageComputation();

		call.printMessage();

		call.checkEmployeeAttendance();

		call.calculateEmployeeDailyWage();
	}
}
