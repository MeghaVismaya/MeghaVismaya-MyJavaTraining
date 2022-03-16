package training.java.list;

import java.util.ArrayList;
import java.util.List;

public class Colors {
	public static void main(String[] args) {
		List<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Black");
		color.add("Green");
		color.add("White");
		System.out.println("Color List : ");
		for (String c : color) {
			System.out.println(c);
		}

	}

}
