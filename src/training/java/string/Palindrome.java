package training.java.string;

public class Palindrome {
	private String str;
	private String reverse;

	public Palindrome(String str) {
		this.str = str;
	}

	public void findReverse() {
		int length = str.length();
		reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

	}

	public void checkPalindrome() {
		if (str.equalsIgnoreCase(reverse)) {
			System.out.println(str+" is Palindrome");
		} else {
			System.out.println(str+" not Palindrome");
		}

	}

	public static void main(String[] args) {

		Palindrome r1 = new Palindrome("Java");
		Palindrome r2 = new Palindrome("Malayalam");
		r1.findReverse();
		r1.checkPalindrome();
		r2.findReverse();
		r2.checkPalindrome();

	}
}
