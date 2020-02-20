import java.util.*;
public class array5
{
	public static void main (String args[])
	{
		Scanner s1 = new Scanner (System.in);

		int ar[] = new int [20];
		int fact[] = new int [20];

		for(int i = 0; i<ar.length; i++)
			ar[i] = (int)(Math.random()*10)+1;

		for (int i = 0; i<ar.length;i++)
		{
			int f = 1;
			for(int j = 1; j<=ar[i]; j++)
				f = f * j;
			fact[i] = f;
		}


		for (int i = 0; i<ar.length; i++)
			System.out.println("data ["+i+"] = "+ar[i]+"\tFact ["+i+"] = " + fact[i]);

		System.out.println("Please enter the number you want counted : ");
		int x = s1.nextInt();

		int count = 0;
		for(int i = 0; i<ar.length; i++)
			if(ar[i] == x)
				count++;

		System.out.println("Occurence of "+x+": "+count);
	}
}