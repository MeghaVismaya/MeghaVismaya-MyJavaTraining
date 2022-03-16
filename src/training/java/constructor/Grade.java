package training.java.constructor;


public class Grade {
	private int maths;
	private int physics;
	private int hindi;
	private char grade;

	public Grade(int maths, int physics, int hindi) {
		this.maths = maths;
		this.physics = physics;
		this.hindi = hindi;
	}

	public int findTotal() {
		int total = 0;
		total = maths + physics + hindi;
		return total;
	}

	public void findGrade(int total) {
		if (total >= 290) {
			grade = 'A';
		} else if (total < 290 && total >= 270) {
			grade = 'B';
		} else if (total < 270 && total >= 250) {
			grade = 'C';
		} else if (total < 250 && total >= 200) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		displayGrade();
	}

	public void displayGrade() {
		System.out.println("Grade=" + grade);
	}
	public static void main(String args[]) {
		Grade s1 = new Grade(90, 80, 70);
		System.out.println("Grade sheet of First student:");
		int total1 = s1.findTotal();
		System.out.println("TotalMarks=" + total1);
		s1.findGrade(total1);
		System.out.println("Grade sheet of Second student:");
		Grade s2 = new Grade(100, 100, 100);
		int total2 = s2.findTotal();
		System.out.println("TotalMarks=" + total2);
		s1.findGrade(total2);
	}

}
