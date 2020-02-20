import java.util.*;
public class ssarray2
{
	public static void main(String args[])
	{
		int ar[] = {11,22,5,6,77,8,9,28,14,14,5,5};
		int count = 0;

		//second way of search
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number you would like to search : ");
		int x = s1.nextInt();

		for (int i = 0; i<ar.length;i++)
			if(ar[i] == x)
			{
				count++;
			}

		if (count == 1)
			System.out.println("Found 1 time");
		else if (count == 0)
			System.out.println("Not Found");
		else
			System.out.println("Found "+count+" times");


		//sorting
		for (int i = 0; i<ar.length-1;i++)
			for(int j = 0; j<ar.length-1;j++)
				if (ar[j]>ar[j+1])
				{
					int T = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = T;
				}

		for (int i = 0; i<ar.length;i++)
			System.out.println(ar[i]);


	}
}