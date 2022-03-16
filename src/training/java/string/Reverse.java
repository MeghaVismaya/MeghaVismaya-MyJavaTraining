package training.java.string;

public class Reverse {

	public static void main(String[] args) {

		String str = "Vismaya";
		String reverse = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse of "+str+" is "+reverse);

	}

}
