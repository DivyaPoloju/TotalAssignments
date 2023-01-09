

import java.util.Scanner;
import java.util.function.Function;

public class MethodReference {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		long n=sc.nextLong();
		Function<Long,Long> fact = Factorial::factorial;  
		long result = fact.apply(n);
		System.out.println("Factorial of " +n+ " is: "+result);  
	}

}
