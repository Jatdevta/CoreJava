package typeCasting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToBuffer {
	public static void main(String[] args) throws ParseException {
		
		StringBuffer sb = new StringBuffer("22/01/2024");
		String sr =sb.toString();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d=sdf.parse(sr);
		
		System.out.println(d);
		System.out.println(sr);
	}

}
