package training.java.polymorphism.methodoverriding2;

public class SumCheck extends Sum {

	private int total;

	@Override
	public int findresult() {
		int flag=0;
		total = super.findresult();
		if (total % 10 == 0) {
			flag = 1;
		} else {
			flag = 0;
		}
		return flag;
	}

	public void display(int flag) {
		if (flag == 1) {
			System.out.println(total + " is divisible by 10");
		} else {
			System.out.println(total + " is not divisible by 10");
		}
	}
}
