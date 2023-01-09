
//Creates memory only once to variables, methods and classes
//No need of creating object to class, we can access members using classname(classname.method(),classname.variablename)
class StaticKeyword {

	   // static variables
	   static int a = 23;
	   static int b;
	   static int max;

	   // static blocks
	   static {
	       System.out.println("First Static block.");
	       b = a * 4;
	   }
	   static {
	       System.out.println("Second Static block.");
	       max = 30;
	   }

	   // static method
	   static void display() {

	       System.out.println("a = " + a);
	       System.out.println("b = " + b);
	       System.out.println("max = " + max);
	   }

	   public static void main(String args[]) {
	       // calling normally method
//		   StaticKeyword obj=new StaticKeyword();
//		   obj.display();
		   
		   
		   StaticKeyword.display();
		   
	     
	   }
	}
