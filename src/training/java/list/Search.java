package training.java.list;

import java.util.ArrayList;
import java.util.List;

public class Search {
	public static void main(String[] args) {
		List<String> car = new ArrayList<String>();
		car.add("BMW");
		car.add("Maruti");
		car.add("Kia");
		car.add("Ferrari");
		String searchElement = "Kia";
		boolean isSearch = car.contains("Kia");
		if (isSearch == true) {
			System.out.println(searchElement + " found in list");
		}

	}
}
