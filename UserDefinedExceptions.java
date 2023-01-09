

import java.util.Scanner;

public class UserDefinedExceptions {
	
	public UserDefinedExceptions() throws CannotBeBlankException
	{

		// TODO Auto-generated method stub
		System.out.println("Enter First Name");
		Scanner sc=new Scanner(System.in);
		String firstName=sc.nextLine();
		
		if(firstName.trim().length()==0 || firstName.isEmpty())
		{
			throw new CannotBeBlankException("First Name cannot be blank or empty"); 
		}
		
		System.out.println("Enter Last Name");
		String lastName=sc.next();
		
		if(lastName.trim().length()==0 || lastName.isEmpty())
		{
			throw new CannotBeBlankException("Last Name cannot be blank or empty"); 
		}
		
		if(null!=firstName && firstName.trim().length()>0 && null!=lastName && lastName.trim().length()>0)
			{
				System.out.println("User Name Validated Successfully !");
			}
		

	
	}

	
	
	public class CannotBeBlankException extends Exception {
		
		public CannotBeBlankException(String msg)
		{
			super(msg);
		}

	}
	
	public static void main(String[] args) throws CannotBeBlankException {
		new UserDefinedExceptions();
	}

}
