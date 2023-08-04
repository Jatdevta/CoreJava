package oopConcept;

public class TestBioData {
	public static void main(String[] args) {
		BioData bd = new BioData();
		
		bd.setPersonName("Raj");
		System.out.println(bd.getPersonName());
		
		bd.setDateOfBirth("09/08/1998");
	System.out.println(bd.getDateOfBirth());
		
		bd.setAddress("Bharat");
	System.out.println(bd.getAddress());
		
	System.out.println(bd.avgAge);
	}

}
