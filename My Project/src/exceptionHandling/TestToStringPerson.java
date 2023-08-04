package exceptionHandling;

public class TestToStringPerson {
	public static void main(String[] args) {
		ToStringPerson s = new ToStringPerson(1,"Raj","Indore");
		System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress());
	}

}
