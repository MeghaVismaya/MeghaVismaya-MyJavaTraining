package training.java.abstraction1;

public class Contractor extends Employee {
	private int workHours;
	private int hourlyPayment;

	public Contractor(String name, int workHours, int hourlyPayment) {
		super(name);
		this.workHours = workHours;
		this.hourlyPayment = hourlyPayment;
	}

	@Override
	public void calculateSalary() {
		int sal = 0;
		sal = workHours * hourlyPayment;
		System.out.println("Contractor Salary of " + getName() + " is " + sal+"$");
	}
}
