import java.util.*;
 public class array2d2
 {
    public static void main( String aaa[] )
    {
   // Declare a Matrix with size SXS (Read size from user)

   Scanner s1 = new Scanner(System.in);
   System.out.print("Enter size: ");
   int s =  s1.nextInt();

    int[][] ar = new int[s][s];

    // fill with a random number between 1 and 10
	    for(int i=0 ;i<ar.length; i++)
	        for(int j=0 ;j<ar[i].length; j++)
	            ar[i][j] = (int) (Math.random() * 10 ) + 1 ;

    // Print the array
	    for(int i=0 ;i<ar.length; i++)
	    {
	        for(int j=0 ;j<ar[i].length; j++)
	            System.out.print(ar[i][j]+ "\t");
	         System.out.println();
		 }
System.out.println("------------------------");

   // Print the Mo7ee6
	    for(int i=0 ;i<ar.length; i++)
	    {
	        for(int j=0 ;j<ar[i].length; j++)
	           if( i==0 || i==ar.length-1 || j==0 || j==ar.length-1  )
	                System.out.print(ar[i][j]+ "\t");
	           else
	                System.out.print("\t");
	         System.out.println();
		 }


System.out.println("------------------------");
// Sum of Left Diagonal
int sum = 0;
for(int i=0; i<ar.length ;i++)
   sum = sum + ar[i][i] ;
System.out.println("Sum = " + sum ) ;

// Sum of Left Diagonal (Nested Loop)
sum = 0;
for(int i=0; i<ar.length ;i++)
   for(int j=0; j<ar[i].length ;j++)
     if( i== j )
      sum = sum + ar[i][j] ;
System.out.println("Sum = " + sum ) ;


// Sum of 3'rd row   (one Loop)
sum = 0;
for(int i=0; i<ar[2].length ;i++)
    sum = sum + ar[2][i] ;
System.out.println("Sum 3rd = " + sum ) ;

// Sum of 3'rd row   (nested Loop)
sum = 0;
for(int i=0 ;i<ar.length; i++)
      for(int j=0 ;j<ar[i].length; j++)
          if( i== 2 )
             sum = sum + ar[i][j] ;
System.out.println("Sum 3rd = " + sum ) ;
//========================================




    }// main

 } // class