package training.java.abstraction2;

public abstract class Bank {
	private int bal;

	public abstract void addInterest(int interest);

	public void deposit(int amount) {
		bal = bal + amount;

	}

	public void withdrawal(int amount) {
		if (bal >= amount) {
			bal = bal - amount;
		} else {
			System.out.println("No sufficient funds to withdraw");
		}
	}

	public int getBal() {
		return bal;
	}

}
