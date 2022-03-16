package training.java.singleinheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		PgStudent pg= new PgStudent();
		pg.setStudentId("P001");
		pg.setName("Megha");
		pg.setCourse("MTECH");
		pg.setSpecialisation("CS");
		pg.display();
		System.out.println("Course : "+pg.getCourse());
		System.out.println("Specialisation : "+pg.getSpecialisation());
	}
}
