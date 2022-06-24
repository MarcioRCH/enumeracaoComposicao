package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class EmployeeOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Department name: ");
		String deptName = sc.nextLine();
		System.out.print("Payday: ");
		int payDay = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Phone: ");
		String phone = sc.nextLine();
		
		Department dept = new Department(deptName, payDay, new Address(email, phone));
		
		System.out.print("How many employees does the department have? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.println("Employee data #" + (i + 1));
			sc.nextLine();
			System.out.print("Name: ");
			String empName = sc.nextLine();
			System.out.print("Salary: $");
			double empSalary = sc.nextDouble();
			Employee emp = new Employee(empName, empSalary);
			dept.addEmp(emp);
			System.out.println();
		}
		showReport(dept);
		sc.close();
	}
	
	private static void showReport(Department dept) {
		System.out.println("PAYROLL");
		System.out.print("Department " + dept.getName() + " = $" + String.format("%.2f", dept.payroll()));
		System.out.printf("\nPayment made on the day: %d\n", dept.getPayDay());
		System.out.println("Employees:");
		for(Employee e : dept.getEmp()) {
			System.out.println(e.getName());
		}
		System.out.print("For questions, please contact: " + dept.getAddress().getEmail());
	}

}