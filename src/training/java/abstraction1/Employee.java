package training.java.abstraction1;

public abstract class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public abstract void calculateSalary();

	public String getName() {
		return name;
	}

}
