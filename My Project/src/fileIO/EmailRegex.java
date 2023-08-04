package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmailRegex {
	public static void main(String[] args) throws IOException {
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

FileReader m = new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\FileStream\\EmailRegex.txt"); 
BufferedReader in = new BufferedReader(m);
String line = in.readLine();
while (line == null) {
	System.out.println(line);
	line = in.readLine();
}
in.close();
if (line.matches(emailreg)) {
	System.out.println("line matches successfully"+line);
}
else {
	System.out.println("No match found");
}
	}
	


}
