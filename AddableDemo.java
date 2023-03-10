
import com.divya.lambda.MyDemo.Addable;

public class AddableDemo {

	  
	    public static void main(String[] args) {  
	          
	        // Multiple parameters in lambda expression  
	        Addable ad1=(x,y)->(x+y);  
	        System.out.println(ad1.add(10,20));  
	          
	        // Multiple parameters with data type in lambda expression  
	       // Addable ad2=(int x,int y)->(x+y);  
	       // System.out.println(ad2.add(100,200));  
	    }  
	    
	    interface Addable{  
		    int add(int a,int b);  
		}  
	}  

