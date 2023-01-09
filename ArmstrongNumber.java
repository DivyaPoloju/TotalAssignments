
import java.util.Scanner;

public class ArmstrongNumber {
   public static boolean isArmstrong(int number, int order){

      // declare variables
      int lastDigit = 0;
      int power = 0;
      int sum = 0;

      // temporary variable to store number
      int n = number;

      while(n!=0) {
         // find last digit
         lastDigit = n % 10;

         // find power of digit
         power = (int) Math.pow(lastDigit, order);

         // add power value into sum
         sum += power;

         // remove last digit
         n /= 10;
      }

      if(sum == number) return true;
      else return false;
   }

   public static void main(String[] args) {

       // declare variables
       int number = 0;
       int order = 0;

       // create Scanner class object 
       Scanner scan = new Scanner(System.in);

       // take input
       System.out.print("Enter integer number::");
       number = scan.nextInt();
       System.out.print("Enter order to check::");
       order = scan.nextInt();

       //check number is Armstrong number or not
       if(isArmstrong(number, order)) 
          System.out.println( number +" is "
            +"Armstrong number of order "+ order);
       else
          System.out.println( number +" is not "
            +"Armstrong number of order "+ order);

       // close Scanner class object
       scan.close();
  }
}