package week1.day5.assignment3;

public class PermanentEmployee extends Employee {
	int paidLeave;
	int sickLeave;
	int casualLeave;
	
	double basic, hra, pfa;
	
	void printLeaveDetails() {
		System.out.println("Paid leave available: " + paidLeave);
		System.out.println("Sick leave available: " + sickLeave);
		System.out.println("Casual leave available: " + casualLeave);
	}
	
	@Override
	void calculateBalanceLeaves () {
		System.out.println("Total leaves available: " + Integer.toString(paidLeave + sickLeave + casualLeave));
	}
	
	@Override
	boolean availLeave(int numberOfLeaves, char typeOfLeave) {
		if (typeOfLeave == 'p') {
			if (numberOfLeaves > paidLeave)
				return false;
			else
				return true;
		}
		else if (typeOfLeave == 's') {
			if (numberOfLeaves > sickLeave)
				return false;
			else
				return true;
		}
		else if (typeOfLeave == 'c')
			if (numberOfLeaves > casualLeave)
				return false;
			else
				return true;
		else {
			throw new IllegalArgumentException ("Leaves are only 'p', 's', or 'c'");
		}
	}
	
	@Override
	void calculateSalary() {
		pfa = hra * .12;
		double totalSalary = basic + hra - pfa;
		System.out.println("Salary for " + name + " is " + Double.toString(totalSalary));
	}
}
