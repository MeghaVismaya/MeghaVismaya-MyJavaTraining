package training.java.array1;

public class Reverse {
	public static void main(String[] args) {
		int num[]=new int[3];
		int rev[]=new int[3];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		int temp=num.length-1;
		for(int i=0;i<=temp;i++)
		{
			rev[temp-i]=num[i];
		}
		System.out.println("Reverse of array : ");
		for(int r: rev)
		{
		System.out.println(r);
		}
	}

}
