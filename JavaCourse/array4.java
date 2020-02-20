import java.util.*;
public class array4
{
	public static void main (String args[])
	{
		int ar[] = new int[10];

		Scanner s1 = new Scanner(System.in);

		for (int i = 0; i<ar.length; i++)
		{
			System.out.print(i+1+") Enter the number: ");
			ar[i] = s1.nextInt();
		}

		System.out.println("-------------------");

		for (int i = 0; i<ar.length; i++)
			System.out.println("ar ["+i+"]"+ ar[i]);

		System.out.println("-------------------");

		int sum = 0;
		for(int i = 0; i<ar.length; i++)
			sum += ar[i];

		System.out.println("Sum = "+sum);
	}
}