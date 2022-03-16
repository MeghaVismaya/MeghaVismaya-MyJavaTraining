package training.java.abstraction1;

public class FullTimeEmployee extends Employee {
	private int hourlyPayment;

	public FullTimeEmployee(String name, int hourlyPayment) {
		super(name);
		this.hourlyPayment = hourlyPayment;
	}

	@Override
	public void calculateSalary() {
		int sal = 0;
		sal = 8 * hourlyPayment;
		System.out.println("Contractor Salary of " + getName() + " is " + sal+"$");
	}
}
