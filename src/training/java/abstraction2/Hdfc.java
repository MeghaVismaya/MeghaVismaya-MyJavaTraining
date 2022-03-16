package training.java.abstraction2;

public class Hdfc extends Bank {
	@Override
	public void addInterest(int interest) {

		int interestAmount = getBal() * interest / 100;
		deposit(interestAmount);

	}

}
