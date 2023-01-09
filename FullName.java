

import java.util.Scanner;

public class FullName {
	
	public static void main(String[] args)
	{
		System.out.println("Please Enter First Name");
		Scanner sc=new Scanner(System.in);
		String firstname=sc.nextLine();
		System.out.println("Please Enter Middle Name");
		String middlename=sc.nextLine();
		System.out.println("Please Enter Last Name");
		String lastname=sc.nextLine();
		
		System.out.println(capitalize(firstname)+ " "+capitalize(middlename) +" "+capitalize(lastname));
		
	}
	
	public static String capitalize(String inputString) {

		// get the first character of the inputString
		char firstLetter = inputString.charAt(0);

		// convert it to an UpperCase letter
		char capitalFirstLetter = Character.toUpperCase(firstLetter);

		// return the output string by updating
		//the first char of the input string
		return inputString.replace(inputString.charAt(0), capitalFirstLetter);
	}

}
