package training.java.polymorphism.methodoverriding2;

public class Divisibility {
	public static void main(String[] args) {
		SumCheck chkSum = new SumCheck();
		chkSum.setNum1(3);
		chkSum.setNum2(2);
		int flag = chkSum.findresult();
		chkSum.display(flag);
	}
}
