package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\LENOVO\\Desktop\\Filestream\\FileWriter.txt");
		file.write("this is filewriter");
		file.close();
	}

}
