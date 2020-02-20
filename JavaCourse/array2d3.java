 import java.util.*;
 public class array2d3
 {
    public static void main( String aaa[] )
    {
    // Declare Two-Dimensional Array with size rXc (Read from user)

   Scanner s1 = new Scanner(System.in);
   System.out.print("Enter Row: ");
   int r =  s1.nextInt();
   System.out.print("Enter Column: ");
   int c =  s1.nextInt();

   int[][] ar = new int[r][c];

    // fill with a random number between 1 and 10
	    for(int i=0 ;i<ar.length; i++)
	        for(int j=0 ;j<ar[i].length; j++)
	            ar[i][j] = (int) (Math.random() * 10 ) + 1 ;

    // Print the array , and the sum of each Row
	    for(int i=0 ;i<ar.length; i++)
	    {
	        int sum = 0;
	        for(int j=0 ;j<ar[i].length; j++)
	           {
	              System.out.print(ar[i][j]+ "\t");
			      sum = sum + ar[i][j];
			   }
	         System.out.println("Sum = " + sum);
		 }
System.out.println("------------------------");




    }// main

 } // class
