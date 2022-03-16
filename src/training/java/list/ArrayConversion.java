package training.java.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayConversion {
	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(4);
		number.add(1);
		number.add(10);
		number.add(3);
		Integer[] num1 = new Integer[number.size()];
		for (int i = 0; i < number.size(); i++) {
			num1[i] = number.get(i);
		}
		System.out.println("After Array conversion manually");
		for (Integer n : num1) {
			System.out.println(n);
		}
		Integer[] num2 = new Integer[number.size()];
		number.toArray(num2);
		System.out.println("After Array conversion using built in function");
		for (Integer n : num2) {
			System.out.println(n);
		}

	}
}
