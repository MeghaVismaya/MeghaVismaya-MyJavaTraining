package training.java.inheritance;

public class TotalSalary extends Allowance {

	private int totalSal;
	
	public void calculateTotal()
	{
		calculateHra();
		calculatePf();
		totalSal=getBasicPay()+getHra()-getPf()-getDeduction()+getBonus();
	}
	public void printSalarySlip()
	{
		System.out.println("********Salary Slip********");
		System.out.println("Basic Pay :"+getBasicPay());
		System.out.println("HRA :"+getHra());
		System.out.println("PF :"+getPf());
		System.out.println("Deductions :"+getDeduction());
		System.out.println("Bonus :"+getBonus());
		System.out.println("Total Salary :"+totalSal);
	}

}
