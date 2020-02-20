import java.util.*;
public class methods2
{
	public static void main (String args[])
	{
		double i = 40,j = 120;


		System.out.println("C\tF\tF\tC");

		while (i>=31)
		{
			System.out.printf("%.1f\t%.1f\t%.1f\t%.2f\n",i,c2f(i),j,f2c(j));
			i = i - 1;
			j = j - 10;
		}
	}

	public static double c2f(double c)
	{
		double f = 9.0 / 5 * c + 32;
		return f;
	}

	public static double f2c(double f)
	{
		double c = 5.0 / 9 * (f-32);
		return c;
	}


}