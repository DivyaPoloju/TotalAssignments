

import java.util.Scanner;

public class TriangleAreaPerimeterExample {

	public static void main(String[] args) {
		// read user input using scanner
		double a, b, c, Perimeter, Area;
		a = 3;
		b = 4;
		c = 5;
		Perimeter = a + b + c;
		double s = (a + b + c)/2; // Perimeter/2
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.format("\n The AreaDemo of triangle = %.2f\n",Area);
		System.out.format("\n The Perimeter of Traiangle = %.2f\n", Perimeter);
		

	}

}
