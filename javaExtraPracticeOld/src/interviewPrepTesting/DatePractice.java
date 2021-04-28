package interviewPrepTesting;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePractice {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 12);
		Date d = cal.getTime();
		System.out.println(d);
		//to get the day - d is a date object
		//convert it to string to use substring method
		
		String day = d.toString().substring(0, 4);
		System.out.println(day);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
		String formatted = sdf.format(d);
		System.out.println(formatted);
		String[] dateArray = formatted.split("/");
		for(int i=0; i< dateArray.length; i++) {
			System.out.println(dateArray[i]);
		}
		
		/*
		 * String s = "hello world";
		 * System.out.println(s.hashCode()+" hellow world and s"); s = "testing";
		 * System.out.println(s.hashCode()+" testing and s"); String n = "hello world";
		 * System.out.println(n.hashCode()+" hello world and n"); String newString = new
		 * String("testing");
		 * System.out.println(newString.hashCode()+" testing and newString");
		 * System.out.println(s.equals(newString)); System.out.println(s);
		 * System.out.println(newString); System.out.println(s == newString);
		 */
		
		String a = "Hi";
		String b = new String("Hi");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode()+" "+b.hashCode());
		
	}
}
