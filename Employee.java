package week1.day5.assignment3;

public class Employee {
	int employeeId;
	String name;
	int totalLeaves;
	double totalSalary;
	
	void calculateBalanceLeaves() {
		System.out.println("total leave available: " + totalLeaves);
	}
	
	boolean availLeave(int numberOfLeaves, char typeOfLeave) {
		if (numberOfLeaves > totalLeaves)
			return false;
		else
			return true;
	}
	
	void calculateSalary() {
		System.out.println("Total salary: " + totalSalary);
	}
}
