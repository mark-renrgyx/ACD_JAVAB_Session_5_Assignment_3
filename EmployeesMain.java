package week1.day5.assignment3;

import java.util.ArrayList;
import java.util.List;

public class EmployeesMain {

	public static void main(String[] args) {
		// Demonstration of upcasting into List, then downcasting
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new PermanentEmployee());
		employees.add(new TemporaryEmployee());
		
		//Testing the classes
		PermanentEmployee perm1 = (PermanentEmployee) employees.get(0);
		perm1.casualLeave = 5;
		perm1.paidLeave = 6;
		perm1.sickLeave = 7;
		
		perm1.basic = 50.5;
		perm1.hra = 18.8;
		perm1.pfa = 12.2;
		
		perm1.name = "Bill";
		
		if (perm1.availLeave(5, 'c')) {
			System.out.println("Leave is available");
		}
		else
			System.out.println("Not enough leave");
		
		perm1.calculateBalanceLeaves();
		perm1.calculateSalary();
		perm1.printLeaveDetails();
		
		System.out.println();	// Next
		
		TemporaryEmployee temp1 = (TemporaryEmployee) employees.get(1);
		temp1.totalLeaves = 15;
		temp1.totalSalary = 70000.02;
		
		if (perm1.availLeave(16, 'c')) {
			System.out.println("Leave is available");
		}
		else
			System.out.println("Not enough leave");
		
		temp1.calculateBalanceLeaves();
		temp1.calculateSalary();
	}
}
