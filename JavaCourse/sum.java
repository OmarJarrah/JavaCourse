import java.util.*;
public class sum
{
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner (System.in);

		System.out.println ("enter two numbers so you can find out the sum");
		System.out.println ("Please enter the first number");

		int n1 = s1.nextInt();

		System.out.println ("Please enter the second number");

		int n2 = s1.nextInt();

		System.out.println ("the sum is " + sum(n1,n2));

	}

	public static int sum (int n1,int n2)
	{
	int sum = n1 + n2;

	return sum;
	}

}
