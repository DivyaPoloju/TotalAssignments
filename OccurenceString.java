

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class OccurenceString {
    public static void main(String[] args) {
    	
    	System.out.println("Enter Any String: ");
    	Scanner sc=new Scanner(System.in);
    	String myString=sc.nextLine();
    	System.out.println("Enter substring to be searched: ");
        String mySubstring= sc.nextLine();
        int count = 0, index = 0;
        List<Integer> indices=new ArrayList<>();
        while ((index = myString.indexOf(mySubstring, index)) != -1 ){
            count++;
            indices.add(index);
            index++;
        }
        System.out.println("Total occurrences of a substring in the given string: " + count);
        //System.out.println("Indices of substring are: "+indices);
    }
}
