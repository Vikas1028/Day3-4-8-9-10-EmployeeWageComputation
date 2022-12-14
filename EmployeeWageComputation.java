package EmployeeWageComputation;

import java.util.Random;

class EmployeeMonthlyWage {

	int Month, WageForMonth = 0, WagePerHour = 20, FullDayHours = 8, HalfDayHours = 4, FullDays = 0, HalfDays = 0;
	int WagePerHour2 = 10, WageForMonth2 = 0;

	public void FullTimeEmployeeMonthlyWage() {
		for (int i = 1; i <= 20; i++) {
			Random num4 = new Random();
			Month = num4.nextInt(2);
			switch (Month) {
			case 0:
				WageForMonth = WageForMonth + WagePerHour * FullDayHours;
				FullDays = FullDays + 1;
				break;
			case 1:
				WageForMonth = WageForMonth + WagePerHour * HalfDayHours;
				HalfDays = HalfDays + 1;
				break;
			}
		}
		System.out.println(
				"This Month Full Time Employee work FullDay " + FullDays + " Days and HalfDay " + HalfDays + " Days.");
		System.out.println("This Month Full Time Employee Wage is " + WageForMonth + " Rs.");
	}

	public void HalfTimeEmployeeMonthlyWage() {
		FullDays = 0;
		HalfDays = 0;
		for (int i = 1; i <= 20; i++) {
			Random num4 = new Random();
			Month = num4.nextInt(2);
			switch (Month) {
			case 0:
				WageForMonth2 = WageForMonth2 + WagePerHour2 * FullDayHours;
				FullDays = FullDays + 1;
				break;
			case 1:
				WageForMonth2 = WageForMonth2 + WagePerHour2 * HalfDayHours;
				HalfDays = HalfDays + 1;
				break;
			}
		}
		System.out.println("This Month Part Time Employee work FullTime " + FullDays + " Days and HalfTime " + HalfDays
				+ " Days.");
		System.out.println("This Month Part Time Employee Wage is " + WageForMonth2 + " Rs.");
	}
}

public class EmployeeWageComputation extends EmployeeMonthlyWage {

	public int Presenti, Presenti2;
	public int WagePerHour, FullDayHours, HalfDayHours, Hours;
	public int PartTimeWagePerHour;
	public int AddEmployee2, Month, WageForMonth = 0, Month2, WageForMonth2 = 0;
	public int FullDay = 0, HalfDay = 0, FullDay2 = 0, HalfDay2 = 0;
	public int conditionWage = 0, conditionWage2;
	public int partTimeWagePerHour;

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

	// Calculate FullTime Employee Wage for Month
	public void WageForMonth() {
		for (int i = 1; i <= 20; i++) {
			Random num4 = new Random();
			Month = num4.nextInt(2);
			switch (Month) {
			case 0:
				WageForMonth = WageForMonth + WagePerHour * FullDayHours;
				FullDay = FullDay + 1;
				break;
			case 1:
				WageForMonth = WageForMonth + WagePerHour * HalfDayHours;
				HalfDay = HalfDay + 1;
				break;
			}
		}
		System.out.println("This Month Employee work FullTime " + FullDay + " Days and HalfTime " + HalfDay + " Days.");
		System.out.println("This Month Full Time Employee Wage is " + WageForMonth + " Rs.");
	}

	// Calculate FullTime Employee2 Wage for Month till condition match 100 hours or
	// 20 days.
	public void WageForMonthWithCondition() {
		int hours = 00, days = 0, num;
		Random inp = new Random();
		while (hours <= 100 && days <= 20) {
			num = inp.nextInt(2);
			if (num == 0) {
				hours = hours + 4;
				conditionWage = conditionWage + WagePerHour * HalfDayHours;
			} else {
				hours = hours + 8;
				conditionWage = conditionWage + WagePerHour * FullDayHours;
			}
			days = days + 1;
		}
		System.out.println("Wage per Month of Full Time Employee till condition matches 100hr. or 20 days work is "
				+ conditionWage + " Rs.");

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

	// Calculate PartTime Employee Wage for Month
//	public void WageForMonth2() {
//		partTimeWagePerHour = 10;
//		for (int i = 0; i <= 20; i++) {
//			Random num4 = new Random();
//			Month2 = num4.nextInt(2);
//			switch (Month2) {
//			case 0:
//				WageForMonth2 = WageForMonth2 + partTimeWagePerHour * partTimeWagePerHour * FullDayHours;
//				FullDay2 = FullDay2 + 1;
//				break;
//			case 1:
//				WageForMonth2 = WageForMonth2 + partTimeWagePerHour * HalfDayHours;
//				HalfDay2 = HalfDay2 + 1;
//				break;
//			}
//		}
//		System.out
//				.println("This Month Employee work FullTime " + FullDay2 + " Days and HalfTime " + HalfDay2 + " Days.");
//		System.out.println("This Month Part Time Employee Wage is " + WageForMonth2 + " Rs.");
//	}

	// Calculate FullTime Employee2 Wage for Month till condition match 100 hours or
	// 20 days.
	public void WageForMonthWithCondition2() {
		int hours = 00, days = 0, num;
		Random inp = new Random();
		while (hours <= 100 && days <= 20) {
			num = inp.nextInt(2);
			if (num == 0) {
				hours = hours + 4;
				conditionWage2 = conditionWage2 + partTimeWagePerHour * HalfDayHours;
			} else {
				hours = hours + 8;
				conditionWage2 = conditionWage2 + partTimeWagePerHour * FullDayHours;
			}
			days = days + 1;
		}
		System.out.println("Wage per Month of Part Time Employee till condition matches 100hr. or 20 days work is "
				+ conditionWage2 + " Rs.");

	}

	// Solve Using Switch Case
	public void solveUsingSwitchCase() {
		Random num3 = new Random();
		AddEmployee2 = num3.nextInt(7);
		switch (AddEmployee2) {
		case 0:
			System.out.println("PartTime Employee2 is Absent");
			break;
		case 1:
			System.out.println("FullTime Employee2 is Absent");
			break;
		case 2:
			System.out.println("Today PartTime Employee2 is Present and work Full Day");
			break;
		case 3:
			System.out.println("Today PartTime Employee2 is Present and work Half Day");
			break;
		case 4:
			System.out.println("Today FullTime Employee2 is Present and work Full Day");
			break;
		case 5:
			System.out.println("Today FullTime Employee2 is Present and work Half Day");
			break;
		default:
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {

		EmployeeWageComputation call = new EmployeeWageComputation();

		call.printMessage();

		call.checkEmployeeAttendance();

		call.calculateEmployeeDailyWage();

		// call.WageForMonth();

		call.WageForMonthWithCondition();

		call.AddPartTimeEmployee();

		// call.WageForMonth2();

		call.WageForMonthWithCondition2();

		call.solveUsingSwitchCase();

		call.FullTimeEmployeeMonthlyWage();

		call.HalfTimeEmployeeMonthlyWage();
	}
}
