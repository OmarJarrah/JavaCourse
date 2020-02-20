 import java.util.*;
 public class array2d1
 {
    public static void main( String aaa[] )
    {

   // Declare a Matrix with size SXS (Read size from user)

   Scanner s1 = new Scanner(System.in);
   System.out.print("Enter size: ");
   int s =  s1.nextInt();

   int[][] ar = new int[s][s];


    // fill with a random number between 1 and 99
	    for(int i=0 ;i<ar.length; i++)
	        for(int j=0 ;j<ar[i].length; j++)
	            ar[i][j] = (int) (Math.random() * 99 ) + 1 ;

    // Print the array
	    for(int i=0 ;i<ar.length; i++)
	    {
	        for(int j=0 ;j<ar[i].length; j++)
	            System.out.print(ar[i][j]+ "\t");
	         System.out.println();
		 }
System.out.println("------------------------");

   // Print the 2 diagonals only
	    for(int i=0 ;i<ar.length; i++)
	    {
	        for(int j=0 ;j<ar[i].length; j++)
	           if( i== j || i+j == ar.length-1 )
	              System.out.print(ar[i][j]+ "\t");
	           else
	              System.out.print( "\t");
	         System.out.println();
		 }



    }// main

 } // class
