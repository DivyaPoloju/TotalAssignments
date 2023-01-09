

import java.util.Scanner;

public class PositiveNegative {

	
	public static void main(String[] args)
	   {
	      int num, countP=0, countN=0, countZ=0;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter 10 Numbers: ");
	      for(int i=0; i<10; i++)
	      {
	         num = scan.nextInt();
	         if(num<0)
	            countN++;
	         else if(num>0)
	            countP++;
	         else
	            countZ++;
	      }
	      
	      System.out.println("\nTotal Positive Number: " +countP);
	      System.out.println("Total Negative Number: " +countN);
	      System.out.println("Total Zero: " +countZ);
	   }
	}
