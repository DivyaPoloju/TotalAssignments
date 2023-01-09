

import java.util.Optional;
import java.util.Scanner;

public class UserValidation {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Username");
		String uname=sc.next();
		System.out.println("Please Enter Password");
		String pwd=sc.next();
		IUserValidation iUserValidation=(username,password)-> {boolean userFlag=Optional.ofNullable(username).filter(t -> t.equals("divya")).isPresent(); boolean passwordFlag=Optional.ofNullable(password).filter(j -> j.equals("12345")).isPresent(); if(userFlag && passwordFlag) {return "Login Success";} else { return "Login Failed";}};
		System.out.println(iUserValidation.isValidUser(uname, pwd));
	}
	
	public interface IUserValidation {
		
		public String isValidUser(String username, String password);

	}


}
