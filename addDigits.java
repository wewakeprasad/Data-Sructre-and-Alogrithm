//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//For example:
//Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
import java.util.*;

public class addDigits
{
	/*static int findSum(int num)
	{
		if(num<0)
			return -1;
		if(num>=0&&num<=9)
			return num;
		int newNum=0;
		while(num>0)
		{
			int lastDigit=num%10;
			num=num/10;
			newNum=newNum+lastDigit;
		}
		if(newNum>=0&&newNum<=9)
			return newNum;
		else
			return findSum(newNum);

	}*/
	static int findSum(int num)
	{
		while(num>10)
		{
			int temp=0;
			while(num>0)
			{
				temp+=num%10;
				num/=10;
			}
			num=temp;

		}
		return num;
	}
	public static void  main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(findSum(number));
	}
}