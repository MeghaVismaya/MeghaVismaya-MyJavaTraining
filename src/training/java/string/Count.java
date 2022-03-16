package training.java.string;

public class Count {
	public static void main(String[] args) {
		String str = "VismAya";
		int countVowels = 0;
		int countConsonants = 0;
		char ch[] = str.toCharArray();
		for (char c : ch) {

			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				countVowels++;
			} else {
				countConsonants++;
			}

		}
		System.out.println("Count of Vowels :" + countVowels);
		System.out.println("Count of Consonants :" + countConsonants);
	}
}
