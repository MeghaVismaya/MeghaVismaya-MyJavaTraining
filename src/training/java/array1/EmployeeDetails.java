package training.java.array1;
import training.java.array1.Employee;
public class EmployeeDetails {

public static void main(String[] args) {
	
	Employee emp[]=new Employee[10];
	Employee e1=new Employee("Megha","N",20);
	Employee e2=new Employee("Negha","A",21);
	Employee e3=new Employee("Segha","V",22);
	Employee e4=new Employee("Oegha","D",23);
	Employee e5=new Employee("Pegha","E",44);
	Employee e6=new Employee("Qegha","F",26);
	Employee e7=new Employee("Regha","G",27);
	Employee e8=new Employee("Tegha","H",28);
	Employee e9=new Employee("Uegha","T",29);
	Employee e10=new Employee("Vegha","E",20);
	emp[0]=e1;
	emp[1]=e2;
	emp[2]=e3;
	emp[3]=e4;
	emp[4]=e5;
	emp[5]=e6;
	emp[6]=e7;
	emp[7]=e8;
	emp[8]=e9;
	emp[9]=e10;
	System.out.println("***** Details of Employees *****");
	for(Employee em:emp)
	{
		em.display();
	}
			
}
}
