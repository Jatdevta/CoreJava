package exceptionHandling;

public class ToStringPerson {
	private int id=0 ;
	private String name=null ;
	private String address=null ;
	
	
	public ToStringPerson(int id,String name,String adresss) {
		 this.id=id;
		 this.name=name;
		 this.address=adresss;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		
		return super.toString();
	}

}
