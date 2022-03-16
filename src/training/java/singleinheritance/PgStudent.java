package training.java.singleinheritance;

public class PgStudent extends Student {
private String course;
private String specialisation;

public void display()
{
	System.out.println("Student Id : "+getStudentId());
	System.out.println("Student Name : "+getName());
	System.out.println("Institute : "+getINSTITUTE());
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getSpecialisation() {
	return specialisation;
}
public void setSpecialisation(String specialisation) {
	this.specialisation = specialisation;
}
}
