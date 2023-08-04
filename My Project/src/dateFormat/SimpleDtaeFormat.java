package dateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDtaeFormat {
	public static void main(String[] args) throws ParseException {
		 
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String Ram = sdf.format(d);
		System.out.println("Date :"+Ram);
		
		String Ram1 ="22/01/2024";
		Date d1= sdf.parse(Ram1);
		System.out.println(d1);
	}

}
