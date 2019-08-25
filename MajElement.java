import java.util.*;

class MajElement
{
	public static int findMajElement(int array[])
	{
		if(array.length==1)
			return array[0];
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int curr:array)
		{
			if(map.containsKey(curr)&&map.get(curr)+1>array.length/2)
				return curr;
			else if(map.containsKey(curr))
			{
				map.put(curr,map.get(curr)+1);
			}
			else
			{
				map.put(curr,1);
			}
		}
		return 1;
	}
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		int length_of_array=sc.nextInt();
		int array[]=new int[length_of_array];

		for(int i=0;i<length_of_array;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println(findMajElement(array));
	}
}