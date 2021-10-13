package edu.java.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatSetting {
	public static void main(String[] args) throws ParseException 
	{
		/*Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateOnly = new SimpleDateFormat("MMMMMMM dd, yyyy");
		System.out.println(dateOnly.format(cal.getTime()));*/
		DateFormatSetting.addDays();
	}
	
	public static void addDays()
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat dateOnly = new SimpleDateFormat("MMMMMMM dd, yyyy");
		
		c.setTime(new Date()); // Using today's date
		c.add(Calendar.DATE, 5); // Adding 5 days
		String output = dateOnly.format(c.getTime());
		System.out.println(output);
	}
}
