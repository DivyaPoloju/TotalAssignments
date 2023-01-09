

import java.util.Scanner;

public class ReverseString {

	/*public static void main(String[] args) {
		System.out.println("Please Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			int n = str.length() - i;
			if (n % 2 != 0) {
				System.out.print(str.charAt(n - 1));
			}
		}
	}*/
	
	public static void main(String[] args) {
		   String text = "Check two consecutive identical letters in a given string";
		   System.out.println("Original text: " + text);
		   System.out.println("\nReverses the words in the string that have odd lengths:\n" + test(text));
		   text = "Create a object using the Calendar class";
		   System.out.println("\nOriginal text: " + text);
		   System.out.println("\nReverses the words in the string that have odd lengths:\n" + test(text));
		 }
		 public static String test(String str) {
		   String[] str_words = str.split(" ");
		   for (int i = 0; i < str_words.length; i++) {
		     if (str_words[i].length() % 2 != 0) {
		       StringBuilder reverser = new StringBuilder(str_words[i]);
		       str_words[i] = reverser.reverse().toString();
		     }
		   }
		   return String.join(" ", str_words);
		 }
		}


