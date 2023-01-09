

public class Rectangle1 {
	
	private int a;
	private int b;
	
	public Rectangle1(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	int Area()
	{
		return a*b;
	}
	
	public static void main(String[] args)
	{
		
		Rectangle1 rc=new Rectangle1(4,5);
		System.out.println("AreaDemo Of Rectangle 4 and 5 is: "+rc.Area());
		Rectangle1 rc1=new Rectangle1(5,8);
		System.out.println("AreaDemo Of Rectangle 5 and 8 is: "+rc1.Area());
	
	}

}
