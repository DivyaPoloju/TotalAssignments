
//This is current class object
public class ThisKeyword {
	  int x;

	  // Constructor with a parameter
	  public ThisKeyword(int x) {
	    this.x = x;
	  }

	  // Call the constructor
	  public static void main(String[] args) {
		  ThisKeyword myObj = new ThisKeyword(5);
	    System.out.println("Value of x = " + myObj.x);
	  }
	}