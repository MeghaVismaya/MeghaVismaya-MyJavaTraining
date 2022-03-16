package training.java.singleinheritance;

public class Student {
	private String studentId;
	private String name;
	private String INSTITUTE="TocH";
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
    public String getStudentId() {
	return studentId;
    }
    public String getINSTITUTE() {
		return INSTITUTE;
	}
}
