package thread;

public class TestWithThread {
public static void main(String[] args) {
	WithThread t1 = new WithThread("Ram");
	WithThread t2 = new WithThread("Maruti");
	t1.run();
	t2.run();
}
}
