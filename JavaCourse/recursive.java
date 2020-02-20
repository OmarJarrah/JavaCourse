import java.util.*;
public class recursive
{
	public static void main (String args[])
	{
		Scanner s1 = new Scanner(System.in);

		System.out.println("Please enter the number to find the factorial :");
		int x = s1.nextInt();

		System.out.println ("Fact = "+fact(x));


	}
	public static int fact(int x)
	{
		if (x == 1 || x == 0)
			return 1;
		else
			return x * fact(x-1);
	}
}