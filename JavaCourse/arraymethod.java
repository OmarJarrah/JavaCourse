public class arraymethod
{
	public static void main (String args [])
	{
		int ar[] = {4,7,2,1,-8,10,33,9};

		printarray(ar);

		System.out.println("The sum of the array = "+sumarray(ar));

	}
	public static void printarray(int a[])
	{
		for(int i = 0; i<a.length;i++)
			System.out.println(a[i]);
	}
	public static int sumarray(int a[])
	{
		int sum = 0;
		for (int i = 0; i<a.length;i++)
			sum = sum + a[i];

		return sum;
	}
}