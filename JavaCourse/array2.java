public class array2
{
	public static void main (String args[])
	{
		int ar[] = {4,7,2,1,-8,10,33,9};

		//Reverse array

		for (int i = 0; i<ar.length/2;i++)
		{
			int T = ar[i];
			ar[i] = ar[ar.length-1-i];
			ar[ar.length-1-i] = T ;

		}
		for (int i = 0; i<ar.length; i++)
			System.out.println(ar[i]);

		//sum,sum even, sum odd


	}
}