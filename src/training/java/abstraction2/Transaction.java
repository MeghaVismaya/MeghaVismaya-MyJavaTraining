package training.java.abstraction2;

public class Transaction {
	public static void main(String[] args) {
		Hdfc hdfc = new Hdfc();
		hdfc.deposit(10000);
		hdfc.addInterest(6);
		hdfc.withdrawal(4000);
		System.out.println("Current balance in HDFC " + hdfc.getBal());
		Icici icici = new Icici();
		icici.deposit(100000);
		icici.addInterest(12);
		icici.withdrawal(50000);
		System.out.println("Current balance in ICICI " + icici.getBal());
	}
}
