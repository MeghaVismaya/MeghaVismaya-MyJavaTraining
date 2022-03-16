package training.java.aggregation;

public class College {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Megha");
		student.setRollNumber(32);
		Address a=setAddressDetails();
		student.setAddress(a);
		displayStudentDetails(student);

	}

	private static void displayStudentDetails(Student student) {
		System.out.println("****Student Details****");
		System.out.println("Name : "+student.getName());
		System.out.println("Roll Number : "+student.getRollNumber());
		System.out.println("House Name : "+student.getAddress().getHouseName());
		System.out.println("Street Name : "+student.getAddress().getStreetName());
		System.out.println("City : "+student.getAddress().getCity());
		System.out.println("State : "+student.getAddress().getState());
		System.out.println("ZipCode : "+student.getAddress().getZipcode());
	}

	private static Address setAddressDetails() {
		Address address = new Address();
		address.setHouseName("Vis");
		address.setStreetName("Mavoor Road");
		address.setCity("Calicut");
		address.setState("Kerala");
		address.setZipcode(12345);
		return address;
	}

}
