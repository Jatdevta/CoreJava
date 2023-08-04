package collectionFramework;


public class TestHashCodeEqual {
	public static void main(String[] args) {
		Person p1 = new Person(1, "Dubai");
		Person p2 = new Person (1, "Dubai");
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
