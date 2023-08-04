package fileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSeriliazation {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file = new  FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\FileStream\\Seriliazable.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Marksheet m = (Marksheet) in.readObject();
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.maths);
		System.out.println(m.chemistry);
		System.out.println(m.physics);
		System.out.println(m.Total);
		in.close();
		file.close();
	}
}