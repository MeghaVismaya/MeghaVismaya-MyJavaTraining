package training.java.list;

import java.util.ArrayList;
import java.util.List;

public class Retrieval {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		System.out.println("Element at 4th position");
		System.out.println(list.get(3));
	}
}
