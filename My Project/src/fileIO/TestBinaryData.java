package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBinaryData {
	public static void main(String[] args) throws IOException {
		String Saurce = "C:\\Users\\LENOVO\\Downloads\\Raj.jpg";
		String Target ="C:\\Users\\LENOVO\\Desktop\\Raj.jpg";
		
		FileInputStream in = new FileInputStream(Saurce);
		FileOutputStream out = new FileOutputStream(Target);
		
		int ch = in.read();
		while(ch != -1) {
			out.write(ch);
			ch = in.read();
			
		}
		in.close();
		out.close();
	}

}
