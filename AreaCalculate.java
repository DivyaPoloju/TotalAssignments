

import java.util.Scanner;

public class AreaCalculate {
	
	private int length;
	private int breadth;
	
	AreaCalculate()
	{
		
		System.out.println("This program will calculate AreaDemo of Rectangle"); //Display
		System.out.println("Please Enter Length");
		Scanner sc=new Scanner(System.in); //Initiate scanner
		int length=sc.nextInt(); //reads user input and assign that value to length variable;
		System.out.println("Please Enter Breadth");
		int breadth=sc.nextInt();
		setDimension(length, breadth);
		System.out.println("AreaDemo of rectangle: "+getArea());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
			new AreaCalculate(); /*This will create object to AreaDemo class, when object get created
			 				constructor will get executed  Line:10 */
	}
	
	
	private void setDimension(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	private int getArea()
	{
		return length * breadth;
	}
	
	

}
