package thread;

public class TestwithThread {
public static void main(String[] args) {
	WithThread t1 = new WithThread("Raj");
	WithThread t2 = new WithThread("Harsh");
	
	t1.start();
	t2.start();
}
}
