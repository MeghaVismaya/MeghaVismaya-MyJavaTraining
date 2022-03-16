package training.java.interface1;

public class Hdfc implements Rbi {

	@Override
	public void recurringDeposit(double amount,double duration)
	{
		double finalAmount=amount+(amount*Math.pow(1+(INTEREST/12),12*duration));
		System.out.println(finalAmount);
	}
}
