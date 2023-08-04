package fileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerilization {
public static void main(String[] args) throws IOException   {
	
	FileOutputStream file = new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\FileStream\\Seriliazable.txt",true);
	ObjectOutputStream out = new  ObjectOutputStream(file);
	
	Marksheet m = new Marksheet();
	
	m.id= 1;
	m.name= "Raj jat";
	m.chemistry=70;
	m.maths=75;
	m.physics=80;
	m.Total=m.chemistry+m.maths+m.physics;

	out.writeObject(m);
	
out.close();
file.close();
	
}
}