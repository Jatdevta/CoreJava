package thread;

public class TestWithoutThread {
	public static void main(String[] args) {
		WithoutThread t1 = new WithoutThread("Raj");
		WithoutThread t2 = new WithoutThread("Pankaj");
		t1.run();
		t2.run();
	}

}
