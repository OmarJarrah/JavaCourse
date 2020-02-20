import java.util.*;
public class mathrandom2
{
	public static void main (String args [])
	{
		System.out.println("<<< GG: Guess Game >>>");
		System.out.println("Guess Game Between 1 and 10");

		int a = (int)(Math.random()*10)+1;
		int b = -1;
		int x = 0;

		while(b != a)
		{
			Scanner s1 = new Scanner(System.in);
			System.out.print("Enter your Guess: ");
			b = s1.nextInt();

			if (a == b)
				System.out.println ("You Win");
			else if(b>a)
				System.out.println ("Less , ya 25ooha");
			else
				System.out.println ("More , ya 2a5ooha");

			x = x + 1;
		}
		if (x == 1)
			System.out.println ("it took you 1 try");
		else
		System.out.println ("it took you "+x+" tries");
	}
}