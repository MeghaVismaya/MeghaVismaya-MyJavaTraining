package training.java.list;

import java.util.ArrayList;
import java.util.List;

public class Iteration {
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Megha");
		name.add("Vismaya");
		name.add("Dooby");
		name.add("Sun");
		name.add("May");
		for (String i : name) {
			System.out.println(i);
		}
	}
}
