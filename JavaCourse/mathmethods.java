public class mathmethods
{
	public static void main (String args[])
	{
		//basic math methods
		System.out.println("Absoulte vaule = "+ Math.abs(-7));
		System.out.println("Power = "+ Math.pow(2,4));
		System.out.println("The Square root is = "+ Math.sqrt(25));
		System.out.println("The  max value = "+ Math.max(100,200));
		System.out.println("The vaule rounded up is = "+ Math.floor(7.888));
		System.out.println("The vaule rounded down is = "+ Math.ceil(3.2));
		System.out.println("The vaule rounded to the closest integer = "+ Math.round(3.2));

		//math random method

		System.out.println((int)(Math.random()*6)+1);
	}
}