

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateOperations {

	public static void main(String[] args)
	{
		SimpleDateFormat dateInput = new SimpleDateFormat("yyyy-MM-dd");
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Date");
		String strDate = input.nextLine();
		dateOperation(strDate);
		try {
			Date date = dateInput.parse(strDate);
			System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
		} catch (ParseException e) {
			System.out.println("Parce Exception");
		}
	}

	private static void dateOperation(String input) {
		LocalDate ld = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		int year = ld.getYear();
		int month = ld.getMonthValue();
		int day = ld.getDayOfMonth();
		System.out.println(month + " " + day + " " + year);
	}

}
