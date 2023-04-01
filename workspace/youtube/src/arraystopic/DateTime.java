package arraystopic;

import java.util.Date;

public class DateTime {
     public static void main(String[] args) {
		Date d = new Date();  
		System.out.println(d.getDay());
		System.out.println(d.getDate());
		System.out.println(d.getMonth());
		System.out.println(d.getTime());

		d.setYear(2023);
		System.out.println(d.getYear());
		
	}
}
