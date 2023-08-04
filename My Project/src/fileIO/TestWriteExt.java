package fileIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class TestWriteExt {public static void main(String[] args) throws Exception {
	
	FileOutputStream file = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\FileStream\\FileExt.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	Employee m = new Employee();
	m.id=1;
	m.Firstname="Surya ";
	m.Lastname = "Narayan";
	m.Salary = 1000;
	out.writeObject(m);
	
	out.close();
	file.close();
	
}
}