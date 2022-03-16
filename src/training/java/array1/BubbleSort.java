package training.java.array1;

public class BubbleSort {

	public static void main(String[] args) {
		int num[]= {50,10,30,15,25,5};
		int temp=0;
		for(int j=1;j<num.length*num.length;j++)
		{
		for(int i=0;i<num.length-1;i++)
		{
			if(num[i]>num[i+1])
			{
				temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
		}
		}
		for(int n :num)
		{
			System.out.println(n);
		}
	}
}
