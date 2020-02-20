public class methods3
{
	public static void main (String args[])
	{
		double x = 1.0;
		double y = 20.0;
		System.out.println ("Feet\tMeters\tFeet\tMeters");

		while (x<=10)
		{

		System.out.printf("%.1f\t%.3f\t%.1f\t%.3f\n",x,f2m(x),y,m2f(y));

		x = x + 1;
		y = y + 5;
		}
	}

	public static double f2m(double f)
	{
		double m = 0.305 * f;
		return m;
	}

	public static double m2f(double m)
	{
		double f = m / 0.305;
		return f;
	}
}