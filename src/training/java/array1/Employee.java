package training.java.array1;

public class Employee {
	private String fName;
	private String lName;
	private int age;
	
public Employee(String fName,String lName,int age)
{
	this.fName=fName;
	this.lName=lName;
	this.age=age;
}
public void display()
{
	System.out.println("First Name: "+fName);
	System.out.println("Last Name: "+lName);
	System.out.println("Age: "+age);
}

}
