package training.java.inheritance;

public class Allowance extends Salary {

	private int hra;
	private int pf;
	public void calculateHra()
	{
		
		hra=(getBasicPay()*5)/100;
		
		
	}
	public void calculatePf()
	{
		pf=(getBasicPay()*20)/100;
			
	}
	public int getHra() {
		return hra;
	}
	public int getPf() {
		return pf;
	}
	
	
}
