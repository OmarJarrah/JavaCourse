import java.util.*;
public class arraymethod2
{
	public static void main (String args[])
	{
		int ar[] = {10,20,30,40,55,-4,8};
		Scanner s1 = new Scanner (System.in);

		System.out.println("Please enter a number to search :");
		int x = s1.nextInt();

		int y = sarray(ar,x);

		System.out.println(y==-1?"Not found":"Found in index ="+y);


	}
	public static int sarray(int a[],int x)
	{
		for (int i = 0;i<a.length;i++)
			if(a[i] == x)
				return i;

		return -1;

	}
}