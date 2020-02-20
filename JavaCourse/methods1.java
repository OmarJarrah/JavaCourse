import java.util.*;
public class methods1
{
	public static void main (String args[])
	{
		Scanner s1 = new Scanner (System.in);

		displayMenu();

		System.out.println ("Please enter youre lucky number ");

		int x = s1.nextInt();

		f1(x);

		System.out.println ("and now will you please enter three numbers ");

		int a = s1.nextInt();
		int b = s1.nextInt();
		int c = s1.nextInt();

		System.out.println ("the max is = " + max(a,b,c));
	}

	public static void displayMenu()
	{
		System.out.println ("This is how youre going to pass");
		System.out.println ("-------------------------------");
		System.out.println ("You're gonna murder this exam");
	}

	public static void f1(int x)
	{
		System.out.println ("Well aren't ya lucky " + x);
	}

	public static int max(int a,int b,int c)
	{
		int m = a;

		if (b>m)
		{
			m = b;
		}
		else if (c>m)
		{
			m = c;
		}
		else
		{
			m = a;
		}

		return m;
	}


}