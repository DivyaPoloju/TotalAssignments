

import java.util.Scanner;

public class Student {
	
	private String name;
	private int roll_no;
	
	public Student(String name, int roll_no)
	{
		this.name=name;
		this.roll_no=roll_no;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Please enter student name");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			System.out.println("Please enter roll no");
			int roll_no=sc.nextInt();
			new Student(name, roll_no);
			System.out.println("Name: "+name+ "\nRoll No: "+roll_no);
	}

}
