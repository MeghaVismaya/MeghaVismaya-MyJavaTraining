package training.java.array1;

public class LinearSearch {
	public static void main(String[] args) {
		int num[]=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		int searchItem=30;
		int replaceValue=60;
		int location=0;
		int flag=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==searchItem)
			{
				num[i]=replaceValue;
				flag=1;
				location=i+1;
				System.out.println("Element found in location: "+location);
				break;
			}
		}
		if(flag==1)
		{
			for(int n : num)
			{
				System.out.println(n);
			}
		}
		else
		{
			System.out.println("Element not found in array");
		}
	}

}
