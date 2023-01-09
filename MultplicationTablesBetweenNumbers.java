

import java.util.Scanner;

public class MultplicationTablesBetweenNumbers {
 
	public static void main(String[] args)
    {
        // number n for which we have to print the
        // multiplication table.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number From");
		int from=sc.nextInt();
		System.out.println("Enter Number To");
		int to=sc.nextInt();
		
		int small = Math.min(from, to) ;
		int big = Math.max(from, to);

		System.out.println("How many integers are between " + small +  " and " + big + "???");
		System.out.println("Answer : " + (big - small + 1));

		// To print the numbers
		for (int i = small; i <= big; i++)
		{
			printTable(i);
		}
        
 
        // looping from 1 to 10 to print the multiplication
        // table of the number.
        // using for loop
       
        sc.close();
    }
	
	private static void printTable(int n)
	{
		 for (int i = 1; i <= 10; i++) {
	            // printing the n*i,ie ith multiple of n.
	            System.out.println(n + " * " + i + " = "
	                               + n * i);
	        }
		 System.out.println();
	}
}

