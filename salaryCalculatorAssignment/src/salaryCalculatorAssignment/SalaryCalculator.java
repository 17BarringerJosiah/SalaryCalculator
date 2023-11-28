package salaryCalculatorAssignment;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Josiah Barringer - Programming: Salary Calculator Assignment");
		
		Scanner input = new Scanner(System.in);
		
		// Employee #1
		System.out.print ("Enter Employee #1 hourly rate: ");

		double employee1HourlyRate = input.nextDouble();

		System.out.print("Enter Employee #1 hours worked: "); 

		double employee1HoursWorked = input.nextDouble();
		
		double employee1Overtime = employee1HoursWorked - 40;
		
		double employee1Pay = (double) (employee1HourlyRate * 40 + employee1Overtime * employee1HourlyRate * 1.5);
		
		// Employee #2
		System.out.print ("Enter Employee #2 hourly rate: ");

		double employee2HourlyRate = input.nextDouble();

		System.out.print("Enter Employee #2 hours worked: "); 

		double employee2HoursWorked = input.nextDouble();
		
		double employee2Overtime = employee2HoursWorked - 40;
		
		double employee2Pay = (double) (employee2HourlyRate * 40 + employee2Overtime * employee2HourlyRate * 1.5);
		
		// Employee #3
		System.out.print ("Enter Employee #3 hourly rate: ");

		double employee3HourlyRate = input.nextDouble();

		System.out.print("Enter Employee #3 hours worked: "); 

		double employee3HoursWorked = input.nextDouble();
				
		double employee3Overtime = employee3HoursWorked - 40;
				
		double employee3Pay = (double) (employee3HourlyRate * 40 + employee3Overtime * employee3HourlyRate * 1.5);
		
		System.out.printf("Employee #1's Pay is $%.2f%n ", employee1Pay);
		System.out.printf("Employee #2's Pay is $%.2f%n ", employee2Pay);
		System.out.printf("Employee #3's Pay is $%.2f%n ", employee3Pay);
	}

}
