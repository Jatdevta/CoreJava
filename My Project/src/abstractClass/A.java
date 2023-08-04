package abstractClass;

public class A {
	public A() {
		System.out.println("Default Parameter");
	}
	public A (int a) {
		this();
		System.out.println("One Parameter");
	}
	
	public A(int a,int b) {
		this(2);
		System.out.println("Two Parameter");
	}
	public A(int a,int b,int c) {
		this(3);
		System.out.println("Three Parameter");
	}
}
