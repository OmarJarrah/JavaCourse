public class array1
{
	public static void main (String args[])
	{
		int ar[]= {4,7,2,1,8,10,33,9};

		//Print all the elements
		for (int i=0;i<ar.length;i++)
			System.out.println(ar[i]);

		System.out.println("-----------------");


		//Sum of all elements
		int sum = 0;

		for (int i=0; i<ar.length;i++)
			sum = sum + ar[i];

		System.out.println("The sum of the array is " + sum);

		System.out.println("-----------------");

		//Max of all elements
		int max = ar[0];

		for (int j=0; j<ar.length; j++)
		{
			if (max<ar[j])
			{
				max = ar[j];
			}
		}
		System.out.println("The max element is : " + max);

		System.out.println("-----------------");
		//Reverse the order of the elements printed

		for(int x = ar.length -1;x>=0;x--)
			System.out.println(ar[x]);

		System.out.println("-----------------");

		//Special Print array
		for(int y = 0; y<ar.length;y++)
			System.out.println("ar["+y+"] = "+ar[y]);

		System.out.println("-----------------");

		//Min
		int min = ar[0];

		for (int z = 0; z<ar.length; z++)
			if (min>ar[z])
				min = ar[z];

		System.out.println ("The min is = "+min);
		System.out.println("-----------------");

		//Avg
		int sum2 = 0;

		for(int a = 0; a>ar.length;a++)
			sum2 += ar[a];

		System.out.println("The avg = "+ (double)sum/ar.length);

		System.out.println("-----------------");


	}
}
