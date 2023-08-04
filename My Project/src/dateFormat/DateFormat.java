package dateFormat;

import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println("Date : "+d);
		System.out.println("Long Time:"+d.getTime());
	}

}
