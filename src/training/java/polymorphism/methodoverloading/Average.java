package training.java.polymorphism.methodoverloading;

public class Average {
    private int integerAverage;
	private float floatAverage;
	public void calculateAverage(int num1,int num2,int num3)
	{
		int sum=0;
		sum=num1+num2+num3;
		integerAverage=sum/3;
		
	}
	public void calculateAverage(float num1,float num2,float num3)
	{
		float sum=0;
		sum=num1+num2+num3;
		floatAverage=sum/3;
		
	}
	
	public void display()
	{
		System.out.println("Average of Integers: "+integerAverage);
		System.out.println("Average of Float: "+floatAverage);
	}
	public static void main(String[] args) {
		Average avg=new Average();
		avg.calculateAverage(1, 2, 3);
		avg.calculateAverage(4f, 5f, 6f);
		avg.display();
	}
	
}
