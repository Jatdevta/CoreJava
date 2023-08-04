package fileIO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	public int id = 0 ;
	public String Firstname = null;
	public String Lastname = null;
	public int Salary = 0;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(id);
		out.writeObject(Firstname);
		out.writeObject(Lastname);
		out.write(Salary);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		Firstname = (String) in.readObject();
		Lastname = (String) in.readObject();
		Salary = in.readInt();
	}
  
	
}
