package exceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import fileIO.Employee;

public class TestReadExt {
	public static void main(String[] args) throws IOException, Exception    {
		 FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\FileStream\\FileEditor.txt");
		 ObjectInputStream in = new ObjectInputStream(file);
		 
		 Employee e = (Employee) in.readObject();
		 
		 System.out.println(e.id);
		 System.out.println(e.Firstname);
		 System.out.println(e.Lastname);
		 System.out.println(e.Salary);
		 file.close();
		 in.close();
	}

}
