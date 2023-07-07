package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReader {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\dipes\\Desktop\\Raj\\JatDevta.txt");

		BufferedReader reader = new BufferedReader(file);

		String line = reader.readLine();
 
		while (line != null) {
		
		System.out.println(line);

		line = reader.readLine();

	
		}
	reader.close();
	file.close();
	
}
}