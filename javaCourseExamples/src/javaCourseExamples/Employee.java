package javaCourseExamples;

public class Employee extends Person {
	private int salary;
	public void promote(int percent) {
		salary *= 1 + (percent/100);
	}
	public Employee (String fName, String lName, int sal) {
		super(fName, lName);
		salary = sal;
	}
	
}
