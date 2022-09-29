package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	public int Presenti, Presenti2;
	public int WagePerHour, FullDayHours, HalfDayHours, Hours;
	public int PartTimeWagePerHour;

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

	// Add part time Employee and Wage
	public void AddPartTimeEmployee() {
		System.out.println("Part Time Employee Added");
		PartTimeWagePerHour = 10;
		FullDayHours = 8;
		HalfDayHours = 4;
		Random num2 = new Random();
		Presenti2 = num2.nextInt(2);
		if (Presenti2 == 0) {
			System.out.println("Part Time Employee is Absent");
		} else {
			System.out.println("Part Time Employee is Present");
		}
		if (Presenti2 == 1) {
			Random num3 = new Random();
			Hours = num3.nextInt(2);
			if (Hours == 1) {
				System.out.println("Today Part Time Employee work Full day");
				System.out.println("Today Part Time Employee Wage is " + PartTimeWagePerHour * FullDayHours + " Rs.");
			} else {
				System.out.println("Today Part Time Employee work Half day");
				System.out.println("Today Part Time Employee Wage is " + PartTimeWagePerHour * HalfDayHours + " Rs.");
			}
		}

	}

	public static void main(String[] args) {

		EmployeeWageComputation call = new EmployeeWageComputation();

		call.printMessage();

		call.checkEmployeeAttendance();

		call.calculateEmployeeDailyWage();

		call.AddPartTimeEmployee();
	}
}
