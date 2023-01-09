

import java.util.Scanner;

public class LambdaExpression {
	
	public static void main(String[] args)
	{
		MyInterface obj=(int x,int y)->  "X Value is: "+x +"\nY Value is: "+y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X value");
		int x=sc.nextInt();
		System.out.println("Enter Y value");
		int y=sc.nextInt();
		System.out.println(obj.returnParams(x,y));
	}
	
	@FunctionalInterface
	public interface MyInterface {
		
		public String returnParams(int x, int y);
		

	}


}
