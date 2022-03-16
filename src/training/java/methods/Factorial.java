package training.java.methods;

public class Factorial {
	private int num;
	private int factorial;

	public void findFactorial(int n) {
		num = n;
		factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial = factorial * i;
		}
		display();
	}

	public void display() {
		System.out.println("Factorial of " + num + " is " + factorial);
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.findFactorial(4);

	}
}
