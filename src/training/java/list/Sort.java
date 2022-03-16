package training.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(4);
		number.add(1);
		number.add(10);
		number.add(3);
		System.out.println("Natural Ordering: ");
		Collections.sort(number);
		for (Integer num : number) {
			System.out.println(num);
		}
		System.out.println();
		System.out.println("Descending Ordering: ");
		Collections.reverse(number);
		for (Integer num : number) {
			System.out.println(num);
		}

	}
}
