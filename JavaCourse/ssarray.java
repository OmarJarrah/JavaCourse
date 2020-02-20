import java.util.*;
public class ssarray
{
	public static void main(String args[])
	{
		int ar[] = {11,22,5,6,77,8,9,28,14};

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number you would like to search : ");
		int x = s1.nextInt();

		boolean found = false;

		int i;
		for (i = 0; i<ar.length;i++)
			if(ar[i] == x)
			{
				found = true;
				break;
			}

		if (found)
			System.out.println("Found in position: "+(i+1));
		else
			System.out.println("Not Found");


	}
}