package oopConcept;

public class ContacPerson {
	private int id = 0;
	private String name ;
	private int contactnumber=0;
	
	
	public ContacPerson() {
	}
 
	ContacPerson(int id,String name, int contactnumber){
		this.id=id;
		this.name=name;
		this.contactnumber=contactnumber;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setContactnumber(int contactnumber) {
		this.contactnumber = contactnumber;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getContactnumber() {
		return contactnumber;
	}
}
