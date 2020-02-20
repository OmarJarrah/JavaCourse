public class methodsrev
{
	public static void main (String args[])
	{
		int count = 0;

		for(int i = 2; i<=1000;i++)
		{
			if (isPrime(i))
			{
				System.out.print(i+"\t");
				count++;
			}
			if (count == 10)
			{
				System.out.println();
				count = 0;
			}
		}
	}
	public static boolean isPrime(int num)
	{
		boolean prime = true;

		for (int i = 2; i<num-1;i++)
			if (num%i == 0)
				prime = false;

		return prime;
	}
}