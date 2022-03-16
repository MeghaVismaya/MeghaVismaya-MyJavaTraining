package training.java.inheritance;

public class Employee {
	public static void main(String[] args) {
		
		TotalSalary sal=new TotalSalary();
		sal.setBasicPay(10000);
		sal.setBonus(2000);
		sal.setDeduction(1000);
		sal.calculateTotal();
		sal.printSalarySlip();
	}

}
