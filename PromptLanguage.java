

import java.util.Scanner;

public class PromptLanguage {
	
	public static void main(String[] args)
	{
		System.out.println("Please Enter Languages Known in comma seperated. ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(",");
		System.out.println("Languages Known:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+1 +". "+arr[i]);
		}
		
		
	}
	

}
