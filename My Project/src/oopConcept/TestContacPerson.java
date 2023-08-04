package oopConcept;

public class TestContacPerson {
	public static void main(String[] args) {
		
		ContacPerson cp = new ContacPerson();
		
		cp.setId(18);
		System.out.println(cp.getId());
		
		cp.setName("Raj");
		System.out.println(cp.getName());
		
		cp.setContactnumber(909850751);
		System.out.println(cp.getContactnumber());
	}

}
