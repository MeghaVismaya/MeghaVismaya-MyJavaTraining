package training.java.polymorphism.methodoverriding2;

public class Sum {
	private int num1;
	private int num2;

	public int findresult() {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
