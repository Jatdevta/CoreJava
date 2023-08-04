package oopConcept;


public class BioData {
	private String personName;
	private String DateOfBirth="dd/MM/YYYY";
	private String address;
	
	String avgAge="18";
	
	public String getPersonName() {
		return personName;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public String getAvgAge() {
		return avgAge;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAvgAge(String avgAge) {
		this.avgAge = avgAge;
	}
}
