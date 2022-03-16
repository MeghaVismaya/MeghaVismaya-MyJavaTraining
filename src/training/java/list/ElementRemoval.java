package training.java.list;

import java.util.ArrayList;
import java.util.List;

public class ElementRemoval {
	public static void main(String[] args) {
		List<Integer> age = new ArrayList<Integer>();
		age.add(23);
		age.add(43);
		age.add(33);
		age.add(67);
		age.remove(2);
		System.out.println("Age after removing 3rd element");
		for (Integer i : age) {
			System.out.println(i);
		}
	}
}
