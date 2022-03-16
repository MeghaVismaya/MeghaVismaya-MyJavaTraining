package training.java.constructor;

import java.util.Scanner;

public class Calculator {
	private int num1;
	private int num2;
	private int sum;
	private int diff;
	private int product;
	private float quotient;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void add() {

		sum = num1 + num2;
	}

	public void subtract() {

		diff = num1 - num2;
	}

	public void multiply() {

		product = num1 * num2;

	}

	public void division() {

		quotient = (float) num1 / (float) num2;
		display();
	}

	public void display() {
		System.out.println("The result of calculation for " + num1 + " & " + num2);
		System.out.println("Addition = " + sum);
		System.out.println("Subtraction = " + diff);
		System.out.println("Multiplication = " + product);
		System.out.println("Division = " + quotient);
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		Calculator c = new Calculator(num1, num2);
		c.add();
		c.subtract();
		c.multiply();
		c.division();
	}

}
