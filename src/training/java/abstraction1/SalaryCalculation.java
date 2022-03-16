package training.java.abstraction1;

public class SalaryCalculation {
	public static void main(String[] args) {
		Contractor contract= new Contractor("Meg",10,11);
		contract.calculateSalary();
		FullTimeEmployee permanent= new FullTimeEmployee("Doob",14);
		permanent.calculateSalary();
	}

}
