

import java.util.Scanner;

public class Factorial {
	   public static long factorial(long number) {
	      if (number <= 1) return 1;
	      else return number * factorial(number - 1);
	   }
	   
	   public static void main(String[] args)
	   {
		   System.out.println("Enter the number");
		   Scanner sc=new Scanner(System.in);
		   long n=sc.nextLong();
		   System.out.println("Factorial of "+n+ " is: "+factorial(n));
		   
	   }
	}
