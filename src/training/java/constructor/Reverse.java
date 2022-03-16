package training.java.constructor;

public class Reverse {
	private int num;
	private int rev;

	public Reverse(int num) {
		this.num = num;
		while (num > 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
	}

	public Reverse() {
		this(102);
		System.out.println("Reverse of " + num + " is " + rev);
	}

	public static void main(String[] args) {
		Reverse r = new Reverse();
	}

}
