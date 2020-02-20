public class array3
{
	public static void main(String arg [])
	{

		int ar[]={3,2,5,7,9,12,97,24,54};

		int sum = 0;
		int sume = 0;
		int sumo = 0;

		for(int i=0;i<ar.length;i++)
		{
			sum = sum + ar[i];
			if (ar[i]%2==0)
				sume = sume + ar[i];
			else
				sumo = sumo + ar[i];
		}

		System.out.println("total sum = " + sum);
		System.out.println("sum odd= " + sumo);
		System.out.println("sum even= " + sume);

	}
}