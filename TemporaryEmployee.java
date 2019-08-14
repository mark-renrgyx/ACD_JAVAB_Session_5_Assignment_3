package week1.day5.assignment3;

public class TemporaryEmployee extends Employee {
	
	@Override
	void calculateBalanceLeaves () {
		System.out.println("total leave available as temp: " + totalLeaves); // totalLeaves field in superclass
	}
}
