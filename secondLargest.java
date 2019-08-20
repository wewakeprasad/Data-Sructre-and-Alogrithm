import java.util.*;

class secondLargest
{
	public static int findSecondLargest(int array[])
	{
		int first=array[0];
		int second=-1;
		for(int i=1;i<array.length;i++)
		{
		if(array[i]>first)
		{
		second=first;
		first=array[i];
		}
		if(array[i]>second&&array[i]<first)
		{
		second=array[i];
		}

		}
		return second;
	}
	public static void main(String aars[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //length of array

		int array[]=new int[n];
		//taking input in array
		for(int i=0;i<n;i++)
		{
		array[i]=sc.nextInt();
		}

		System.out.println(findSecondLargest(array));
	}
}