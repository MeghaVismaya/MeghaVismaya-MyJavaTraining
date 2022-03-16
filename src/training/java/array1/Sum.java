package training.java.array1;

public class Sum {
	public static void main(String[] args) {
		int num[] = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		int sum = 0;
		for (int i : num) {
			sum = sum + i;
		}
		System.out.println("Sum of elements in array " + sum);
	}

}
