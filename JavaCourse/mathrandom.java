import java.util.*;
public mathrandom
{
	public static void main (String args[])
	{
		System.out.println("<<< GG: Guess Game >>>");
		System.out.println("Guess Game Between 1 and 10");

		int x = (int)(Math.random()*10) + 1;

		int y = -1;

		while(y != x)
		{
			Scanner maryam = new Scanner(System.in);
			System.out.print("Enter your guess : ");

			y = maryam.nextInt();

			if (x == y)
				System.out.println("You Win");

			else
				System.out.println("You lose");
		}
	}
}